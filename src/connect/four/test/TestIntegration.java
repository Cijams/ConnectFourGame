package connect.four.test;

/**
 * Created by Chris on 8/1/2017.
 */

import connect.four.ConnectFour;
import connect.four.Game;
import connect.four.board.Board;
import connect.four.gui.*;
import connect.four.player.ComputerPlayer;
import connect.four.player.ConsolePlayer;
import connect.four.player.RandomPlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Test to make sure that a large portion of the
 * classes are working well with each other. Testing
 * to ensure the interfaces between classes are not
 * Causing errors or throwing exceptions. Values are
 * unit tested in the other test classes.
 */
public class TestIntegration {
    private RandomPlayer tRandomPlayer;
    private ConsolePlayer tConsolePlayerOne;
    private ConsolePlayer tConsolePlayerTwo;
    private ComputerPlayer tComputerPlayerOne;
    private ComputerPlayer tComputerPlayerTwo;
    private ComputerPlayer[] tComputerPlayerArray;

    private Board tBoard;
    private Board tBoard1;
    private Board tBoard2;
    private Board tBoard3;

    private GameOverPanel tGameOverPanel;
    private GamePanel tGamePanel;
    private GUI tGUI;
    private GUIPiece tGUIPiece;
    private GUIWrapperPlayer tGUIWrapperPlayer;

    private MainMenuPanel tMainMenuPanel;

    private ConnectFour tFour;
    private Game tGame;

    /**
     * Instantiate variables and ensure their creation.
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        tRandomPlayer = new RandomPlayer();
        tConsolePlayerOne = new ConsolePlayer("Josh");
        tConsolePlayerTwo = new ConsolePlayer("Todd");
        tComputerPlayerOne = new ComputerPlayer();
        tComputerPlayerTwo = new ComputerPlayer();
        tComputerPlayerArray = new ComputerPlayer[3];
        tComputerPlayerArray[0] = new ComputerPlayer();
        tGUIWrapperPlayer = new GUIWrapperPlayer(tComputerPlayerOne, tGamePanel);

        tBoard = new Board(10, 23);
        tBoard1 = new Board(100, 100);
        tBoard2 = new Board(1, 1);
        tBoard3 = new Board(0, 0);

        tGUI = new GUI();
        tGUI.updateDisplay();
        tGUI.getName();
        tGUI.getPlayer1Name();
        tGUI.getPlayer2Name();
        tGUI.setScore1(5);
        tGUI.setScore2(3);
        tGUI.setWinner("Todd");
        tGUI.setPlayer1Name("Todd");
        tGUI.setPlayer2Name("Mike");
        tGUI.addMainMenu();
        tGUI.addGamePanel();
        tGUI.removeGamePanel();

        tGameOverPanel = new GameOverPanel(tGUI, "Josh");
        tGamePanel = new GamePanel(tGUI, false, false);
        tGUIPiece = new GUIPiece(1);

        tGamePanel.setSize(20, 20);
        tGUIWrapperPlayer.getName();
        tGUIWrapperPlayer.getBoard();

        tMainMenuPanel = new MainMenuPanel(tGUI);
        tFour = new ConnectFour();
        tComputerPlayerArray[1] = new ComputerPlayer();
        tComputerPlayerArray[2] = new ComputerPlayer();
        tGame = new Game(tComputerPlayerArray, tBoard, 2);
    }

    /**
     * Testing generic actions with as many classes instantiated as possible.
     * Ensuring the interaction between classes does not cause errors during
     * run time. Tests various method calls in relation to other classes.
     */
    @Test
    public void testGame() {
        tGame.getBoard();
        tGame.getCurrentPlayer();
        tGame.getInRow();
        tGame.getPlayers();

        tBoard.play(1, tComputerPlayerOne);
        tBoard.whoPlayed(1, 2);
        tBoard.getColumnHeight(1);
        tBoard.play(2, tComputerPlayerTwo);
        tBoard.getHeight();
        tBoard.clear();
        tBoard.getMoveCount();
        tBoard.getWidth();

        tBoard1.getWidth();
        tBoard2.getWidth();
        tBoard3.getWidth();

        tGameOverPanel.getWidth();
        tGameOverPanel.getHeight();
        tGameOverPanel.getName();

        tComputerPlayerOne.performPlay(tBoard);
        tComputerPlayerTwo.performPlay(tBoard1);
        tComputerPlayerArray[0].performPlay(tBoard2);

        tRandomPlayer.getName();
        tConsolePlayerOne.setName("Mike");
        tConsolePlayerTwo.setName("Todd");
        tConsolePlayerTwo.getName();
        tConsolePlayerOne.getName();

        tGamePanel.turn();
        tGUIPiece.getText();

        tMainMenuPanel.getHeight();
        tMainMenuPanel.getWidth();
        tMainMenuPanel.getName();

        assertNotNull(tComputerPlayerArray[0]);
        assertNotNull(tFour);

        tRandomPlayer.performPlay(tBoard);
        tBoard.play(1, tRandomPlayer);
        tRandomPlayer.performPlay(tBoard);

        tGUI.addGameOver();
    }

    /**
     * dereference variables and call garbage collection
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        tRandomPlayer = null;
        tConsolePlayerOne = null;
        tConsolePlayerTwo = null;
        tComputerPlayerOne = null;
        tComputerPlayerTwo = null;

        tBoard = null;
        tBoard1 = null;
        tBoard2 = null;
        tBoard3 = null;

        tGUI = null;
        tGameOverPanel = null;
        tGamePanel = null;
        tGUIPiece = null;

        tMainMenuPanel = null;

        System.gc();
    }
}
