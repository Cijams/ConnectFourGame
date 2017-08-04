package connect.four.test;

/**
 * Created by Chris on 7/31/2017.
 */

import connect.four.board.Board;
import connect.four.board.ColumnFullException;
import connect.four.player.ComputerPlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing the instantiation of the Board class. The objective of
 * this test is to ensure the board is being properly created while
 * methods related directly to the board are clearly returning their
 * proper theoretical values.
 */
public class TestBoard {
    private Board myTestBoard1;
    private Board myTestBoard2;

    /**
     * Instantiate variables and ensure their creation.
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        assertNull(myTestBoard1);
        myTestBoard1 = new Board(5, 5);
        myTestBoard2 = new Board(2, 2);
        assertNotNull(myTestBoard1);
        Board tBoard = new Board(myTestBoard1);
        assertNotNull(tBoard);
        myTestBoard1 = new Board(myTestBoard2);
    }

    /**
     * Ensure that the board itself can be instantiated. Test the
     * custom exceptions associated with the class.
     */
    @Test
    public void testBoard() {
        myTestBoard1 = new Board(5, 5);
        myTestBoard1.clear();
        myTestBoard1.getColumnHeight(2);
        myTestBoard1.whoPlayed(1, 1);


        ColumnFullException tException = new ColumnFullException();
        tException.getMessage();
    }

    /**
     * Ensure accurate values are being returned from the methods
     * by comparing them against expected values.
     */
    @Test
    public void testBoardAccuracy() {
        assertEquals(myTestBoard1.getWidth(), 2);    // Checking correct width
        assertEquals(myTestBoard1.getHeight(), 2);  // Checking correct height
        assertEquals(myTestBoard1.getColumnHeight(0), 0);
    }

    /**
     * Make sure the players can actually use the various methods
     * the board provides.
     */
    @Test
    public void testMoves() {
        ComputerPlayer tPlayer = new ComputerPlayer();
        myTestBoard1.whoPlayed(0, 0);
        myTestBoard1.play(1, tPlayer);
        myTestBoard1.getMoveCount();
    }

    /**
     * dereference variables and call garbage collection
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        myTestBoard1 = null;

        assertNull(myTestBoard1);

        System.gc();
    }
}
