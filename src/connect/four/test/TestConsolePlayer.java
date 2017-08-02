package connect.four.test;

/**
 * Created by Chris on 7/31/2017.
 */

import connect.four.board.Board;
import connect.four.player.ConsolePlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the ConsolePlayer class. Tests here are quite limited
 * as they require input for STDIN.
 */
public class TestConsolePlayer {
    ConsolePlayer tConsolePlayerOne;
    ConsolePlayer tConsolePlayerTwo;
    Board tBoard;

    /**
     * Instantiate variables and ensure their creation.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        tConsolePlayerOne = new ConsolePlayer("Charlie");
        tConsolePlayerTwo = new ConsolePlayer("Dennis");
        tBoard = new Board(5,5);
    }

    /**
     * Ensure accurate values are being returned from the methods
     * by comparing them against expected values.
     */
    @Test
    public void testGetName() {
        assertNotNull(tConsolePlayerOne.getName());
        assertFalse(tConsolePlayerOne.getName().equals(""));
        assertTrue(tConsolePlayerOne.getName().equals("Charlie"));

        assertNotNull(tConsolePlayerTwo.getName());
        assertFalse(tConsolePlayerTwo.getName().equals(""));
        assertTrue(tConsolePlayerTwo.getName().equals("Dennis"));
    }

    /**
     * Testing values again after setters have been used
     * to alter the values in each console player class.
     */
    @Test public void testSetName() {
        tConsolePlayerOne.setName("Mac");
        tConsolePlayerTwo.setName("Frank");

        assertFalse(tConsolePlayerOne.getName().equals("Charlie"));
        assertTrue(tConsolePlayerOne.getName().equals("Mac"));

        assertFalse(tConsolePlayerTwo.getName().equals("Dennis"));
        assertTrue(tConsolePlayerTwo.getName().equals("Frank"));
    }

    /**
     * dereference variables and call garbage collection
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        tConsolePlayerOne = null;
        tConsolePlayerTwo = null;
        tBoard = null;

        assertNull(tConsolePlayerOne);
        assertNull(tConsolePlayerTwo);
        assertNull(tBoard);

        System.gc();
    }
}
