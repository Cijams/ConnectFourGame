package connect.four;

import connect.four.board.ReadWritableBoard;
import connect.four.board.ReadableBoard;
import connect.four.player.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Game implements ScoreChart {
    private final Player[] m_players;
    private final int[] m_scores;
    private final List<ScoreChart.Listener> m_listeners;
    private final ReadWritableBoard m_board;
    private final int m_inRow;
    private int m_currentPlayer;

    public Game(Player[] players, ReadWritableBoard board, int inRow) {
        m_players = Arrays.copyOf(players, players.length);
        m_scores = new int[players.length];
        m_listeners = new ArrayList<ScoreChart.Listener>();
        m_board = board;
        m_inRow = inRow;
    }

    public static Player detectWinner(ReadableBoard board, int inRow) {
        int l = board.getWidth();
        int m = board.getHeight();
        for (int i = 0; i != l; ++i) {
            Player possible = null;
            int found = 0;
            for (int j = 0; j != m; ++j) {
                if (board.whoPlayed(i, j) == possible && possible != null) {
                    found += 1;
                } else {
                    found = 1;
                    possible = board.whoPlayed(i, j);
                }
                if (found == inRow) {
                    return possible;
                }
            }
        }
        for (int i = 0; i != m; ++i) {
            Player possible = null;
            int found = 0;
            for (int j = 0; j != l; ++j) {
                if (board.whoPlayed(j, i) == possible && possible != null) {
                    found += 1;
                } else {
                    found = 1;
                    possible = board.whoPlayed(j, i);
                }
                if (found == inRow) {
                    return possible;
                }
            }
        }
        for (int i = -l; i != l; ++i) {
            Player possible = null;
            int found = 0;
            for (int j = 0; j != m; ++j) {
                int k = j + i;
                if (k >= 0 && k < l) {
                    if (board.whoPlayed(k, j) == possible && possible != null) {
                        found += 1;
                    } else {
                        found = 1;
                        possible = board.whoPlayed(k, j);
                    }
                    if (found == inRow) {
                        return possible;
                    }
                }
            }
        }
        for (int i = -l; i != l; ++i) {
            Player possible = null;
            int found = 0;
            for (int j = 0; j != m; ++j) {
                int k = j + i;
                if (k >= 0 && k < l) {
                    if (board.whoPlayed(l - k - 1, j) == possible && possible != null) {
                        found += 1;
                    } else {
                        found = 1;
                        possible = board.whoPlayed(l - k - 1, j);
                    }
                    if (found == inRow) {
                        return possible;
                    }
                }
            }
        }
        return null;
    }

    public void start() {
        int first = (new Random()).nextInt(m_players.length);
        performPlay(first);
    }

    public void registerListener(ScoreChart.Listener l) {
        m_listeners.add(l);
    }

    public void unregisterListener(ScoreChart.Listener l) {
        m_listeners.remove(l);
    }

    public List<Player> getPlayers() {
        return Arrays.asList(m_players);
    }

    public int getScore(Player p) {
        int pos = -1;
        int l = m_players.length;
        for (int i = 0; i != l; ++i) {
            if (m_players[i] == p) pos = i;
        }
        return m_scores[pos];
    }

    private void performPlay(final int player) {
        m_currentPlayer = player;
        ReadWritableBoard controlledBoard = new ReadWritableBoard() {
            boolean played;

            public Player whoPlayed(int x, int y) {
                return m_board.whoPlayed(x, y);
            }

            public void play(int x, Player p) {
                if (played) {
                    throw new Error(p + " Played more than once in a turn.");
                }
                played = true;
                m_board.play(x, p);
                Player win = detectWinner(m_board, m_inRow);
                if (win != null) {
                    m_scores[player] += 1;
                    for (ScoreChart.Listener l : m_listeners) {
                        l.gameOver(win, Game.this, m_board);
                    }
                    m_board.clear();
                    performPlay(player);
                } else if (m_board.getMoveCount() == m_board.getWidth() * m_board.getHeight()) {
                    for (ScoreChart.Listener l : m_listeners) {
                        l.gameOver(null, Game.this, m_board);
                    }
                    m_board.clear();
                    performPlay((player + 1) % m_players.length);
                } else {
                    performPlay((player + 1) % m_players.length);
                }
            }

            public void clear() {
                m_board.clear();
            }

            public int getWidth() {
                return m_board.getWidth();
            }

            public int getHeight() {
                return m_board.getHeight();
            }

            public int getColumnHeight(int x) {
                return m_board.getColumnHeight(x);
            }

            public int getMoveCount() {
                return m_board.getMoveCount();
            }
        };
        m_players[player].performPlay(controlledBoard);
    }

    public Player getCurrentPlayer() {
        return m_players[m_currentPlayer];
    }

    public int getInRow() {
        return m_inRow;
    }

    public ReadableBoard getBoard() {
        return m_board;
    }
}
