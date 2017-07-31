package connect.four.test;

/**
 * Created by Chris on 7/31/2017.
 */

import connect.four.board.Board;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class testBoard {
    Board myTestBoard1;
   // Board myTestBoard2;

    @Before
    public void setUp() throws Exception {
        assertNull(myTestBoard1);
       // assertNull(myTestBoard2);

    }

    @Test
    public void testBoard() {
        myTestBoard1 = new Board(5,5);
        //myTestBoard2 = new Board(0,0);  // test 0 values

        // testing basic method calls
        myTestBoard1.clear();
        myTestBoard1.getColumnHeight(2);
        myTestBoard1.whoPlayed(1,1);

        // testing accuracy
        assertEquals(myTestBoard1.getWidth(),5);    // Checking correct width
        assertEquals(myTestBoard1.getHeight(), 5);  // Checking correct height


    }

    @After
    public void tearDown() throws Exception {

    }
}
