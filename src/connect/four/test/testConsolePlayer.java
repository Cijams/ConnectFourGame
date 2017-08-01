package connect.four.test;

import connect.four.board.Board;
import connect.four.player.ConsolePlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

/**
 * Created by Chris on 7/31/2017.
 */
public class testConsolePlayer {
    ConsolePlayer tConsolePlayerOne;
    ConsolePlayer tConsolePlayerTwo;
    Board tBoard = new Board(5,5);

    @Before
    public void setUp() throws Exception {
        tConsolePlayerOne = new ConsolePlayer("Charlie");
        tConsolePlayerTwo = new ConsolePlayer("Dennis");
    }

    @Test
    public void testGetName() {
        assertNotNull(tConsolePlayerOne.getName());
        assertFalse(tConsolePlayerOne.getName().equals(""));
        assertTrue(tConsolePlayerOne.getName().equals("Charlie"));

        assertNotNull(tConsolePlayerTwo.getName());
        assertFalse(tConsolePlayerTwo.getName().equals(""));
        assertTrue(tConsolePlayerTwo.getName().equals("Dennis"));
    }

    @Test public void testSetName() {
        tConsolePlayerOne.setName("Mac");
        tConsolePlayerTwo.setName("Frank");

        assertFalse(tConsolePlayerOne.getName().equals("Charlie"));
        assertTrue(tConsolePlayerOne.getName().equals("Mac"));

        assertFalse(tConsolePlayerTwo.getName().equals("Dennis"));
        assertTrue(tConsolePlayerTwo.getName().equals("Frank"));
    }

    @Test
    public void testDumpBoard() {
    }



    @After
    public void tearDown() throws Exception {

    }
}
