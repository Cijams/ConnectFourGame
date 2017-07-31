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
 *
 */
public class testBoard {
    Board myTestBoard1;

    @Before
    public void setUp() throws Exception {
        assertNull(myTestBoard1);
        myTestBoard1 = new Board(5,5);
        assertNotNull(myTestBoard1);
        Board tBoard = new Board(myTestBoard1);
    }

    @Test
    public void testBoard() {
        myTestBoard1 = new Board(5,5);
        myTestBoard1.clear();
        myTestBoard1.getColumnHeight(2);
        myTestBoard1.whoPlayed(1,1);

        ColumnFullException tException = new ColumnFullException();
        tException.getMessage();
    }

    @Test
    public void testBoardAccuracy() {
        assertEquals(myTestBoard1.getWidth(),5);    // Checking correct width
        assertEquals(myTestBoard1.getHeight(), 5);  // Checking correct height
        assertEquals(myTestBoard1.getColumnHeight(0),0);
    }

    @Test
    public void testMoves() {
        ComputerPlayer tPlayer = new ComputerPlayer();
        myTestBoard1.whoPlayed(0,0);
        myTestBoard1.play(1, tPlayer);
        myTestBoard1.getMoveCount();
    }

    @After
    public void tearDown() throws Exception {

    }
}
