package connect.four.test;
/**
 * Created by Chris on 7/31/2017.
 */

import connect.four.board.Board;
import connect.four.player.ComputerPlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing the ComputerPlayer class. Here we wish to ensure that
 * the CPU player is properly responding to given values.
 */
public class TestComputerPlayer {
    private ComputerPlayer tComputerPlayerOne;
    private ComputerPlayer tComputerPlayerTwo;
    private Board tBoard;
    private Board tBoard2;

    /**
     * Instantiate variables and ensure their creation.
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        tComputerPlayerOne = new ComputerPlayer();
        tComputerPlayerTwo = new ComputerPlayer(0);
        tBoard = new Board(5, 5);
        tBoard2 = new Board(2, 4);
    }

    /**
     * Ensure that two difference computer players can play
     * on two different board without issue.
     */
    @Test
    public void testPerformPlay() {
        tComputerPlayerOne.performPlay(tBoard);
        tComputerPlayerTwo.performPlay(tBoard);

        tComputerPlayerOne.performPlay(tBoard2);
        tComputerPlayerTwo.performPlay(tBoard2);

        tBoard.play(1, tComputerPlayerOne);
        tBoard.play(2, tComputerPlayerTwo);

        tComputerPlayerOne.performPlay(tBoard);
        tComputerPlayerTwo.performPlay(tBoard);

        tBoard.play(3, tComputerPlayerOne);
        tBoard.play(4, tComputerPlayerTwo);

        tComputerPlayerOne.performPlay(tBoard);
        tComputerPlayerTwo.performPlay(tBoard);

        tComputerPlayerOne.performPlay(tBoard);
        tComputerPlayerTwo.performPlay(tBoard);

    }

    /**
     * Ensure accurate values are being returned from the methods
     * by comparing them against expected values.
     */
    @Test
    public void testGetName() {
        assertNotNull(tComputerPlayerOne.getName());
        assertFalse(tComputerPlayerOne.getName().equals(""));
        assertTrue(tComputerPlayerOne.getName().equals("Computer"));

        assertNotNull(tComputerPlayerTwo.getName());
        assertFalse(tComputerPlayerTwo.getName().equals(""));
        assertTrue(tComputerPlayerTwo.getName().equals("Computer"));
    }

    /**
     * dereference variables and call garbage collection
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        tComputerPlayerOne = null;
        tComputerPlayerTwo = null;
        tBoard = null;
        tBoard2 = null;

        assertNull(tComputerPlayerTwo);
        assertNull(tComputerPlayerTwo);
        assertNull(tBoard);
        assertNull(tBoard2);

        System.gc();
    }
}
