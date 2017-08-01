package connect.four.test;

import connect.four.board.Board;
import connect.four.player.RandomPlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Chris on 7/31/2017.
 */
public class testRandomPlayer {
    RandomPlayer tRandomPlayer;
    Board tBoard;
    @Before
    public void setUp() throws Exception {
        tRandomPlayer = new RandomPlayer();
        tBoard = new Board(7,7);
    }

    @Test
    public void testGame() {
        assertNotNull(tRandomPlayer.getName());
        assertFalse(tRandomPlayer.getName().equals(""));
        assertTrue(tRandomPlayer.getName().equals("Computer"));
    }

    @Test
    public void testPerformPlay() {
        tRandomPlayer.performPlay(tBoard);
        tBoard.whoPlayed(2,4);
        tRandomPlayer.performPlay(tBoard);
        tBoard.whoPlayed(1,2);
        tRandomPlayer.performPlay(tBoard);
    }

    @After
    public void tearDown() throws Exception {
        tRandomPlayer = null;
        tBoard = null;

        assertNull(tRandomPlayer);
        assertNull(tBoard);
    }
}
