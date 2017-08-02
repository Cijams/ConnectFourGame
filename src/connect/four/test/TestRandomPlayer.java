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
public class TestRandomPlayer {
    RandomPlayer tRandomPlayer;
    Board tBoard;

    /**
     * Instantiate variables and ensure their creation.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        tRandomPlayer = new RandomPlayer();
        tBoard = new Board(7,7);
    }

    /**
     * Ensure accurate values are being returned from the methods
     * by comparing them against expected values.
     */
    @Test
    public void testGame() {
        assertNotNull(tRandomPlayer.getName());
        assertFalse(tRandomPlayer.getName().equals(""));
        assertTrue(tRandomPlayer.getName().equals("Computer"));
    }

    /**
     * Test to see if a random player can make moves on
     * a board in several different ways.
     */
    @Test
    public void testPerformPlay() {
        tRandomPlayer.performPlay(tBoard);
        tBoard.whoPlayed(2,4);
        tRandomPlayer.performPlay(tBoard);
        tBoard.whoPlayed(1,2);
        tRandomPlayer.performPlay(tBoard);
    }

    /**
     * dereference variables and call garbage collection
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        tRandomPlayer = null;
        tBoard = null;

        assertNull(tRandomPlayer);
        assertNull(tBoard);
        System.gc();
    }
}
