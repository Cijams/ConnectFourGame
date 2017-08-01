package connect.four.test;

import connect.four.board.Board;
import connect.four.player.ComputerPlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Chris on 7/31/2017.
 */
public class testComputerPlayer {
    ComputerPlayer tComputerPlayerOne;
    ComputerPlayer tComputerPlayerTwo;
    Board tBoard;

    @Before
    public void setUp() throws Exception {
        tComputerPlayerOne = new ComputerPlayer();
        tComputerPlayerTwo = new ComputerPlayer(0);
        tBoard = new Board(5,5);
    }

    @Test
    public void testPerformPlay() {
        tComputerPlayerOne.performPlay(tBoard);
        tComputerPlayerTwo.performPlay(tBoard);
    }

    @Test
    public void testGetName() {
        assertNotNull(tComputerPlayerOne.getName());
        assertFalse(tComputerPlayerOne.getName().equals(""));
        assertTrue(tComputerPlayerOne.getName().equals("Computer"));

        assertNotNull(tComputerPlayerTwo.getName());
        assertFalse(tComputerPlayerTwo.getName().equals(""));
        assertTrue(tComputerPlayerTwo.getName().equals("Computer"));
    }

    @After
    public void tearDown() throws Exception {

    }
}
