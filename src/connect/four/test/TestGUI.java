package connect.four.test;

import connect.four.board.Board;
import connect.four.gui.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Chris on 7/31/2017.
 */
public class TestGUI {
    GUI tGUI;
    GameOverPanel tGameOverPanel;
    GamePanel tGamePanel;
    Board tBoard;
    GUIPiece tGUIPiece;
    MainMenuPanel tMainMenuPanel;

    /**
     * Instantiate variables and ensure their creation.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        tGUI = new GUI();
        tGameOverPanel = new GameOverPanel(tGUI, "Chris");
        tBoard = new Board(5,5);
        tGUIPiece = new GUIPiece(5);
        tMainMenuPanel = new MainMenuPanel(tGUI);
        tGamePanel = new GamePanel(tGUI, false);
    }

    /**
     * Ensure accurate values are being returned from the methods
     * by comparing them against expected values.
     */
    @Test
    public void testValues() {
        assertNotNull(tGUI);
        assertTrue(tGUI.getName().equals("frame0"));
        assertNotNull(tGameOverPanel);
        assertTrue(tBoard.getColumnHeight(1) == 0);
        assertTrue(tGUIPiece.getText().equals(""));
        assertNotNull(tMainMenuPanel);
    }

    /**
     * dereference variables and call garbage collection
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        tGUI = null;
        tGameOverPanel = null;
        tBoard = null;
        tGUIPiece = null;
        tMainMenuPanel = null;
        tGamePanel = null;

        assertNull(tGUI);
        assertNull(tGameOverPanel);
        assertNull(tBoard);
        assertNull(tGUIPiece);
        assertNull(tMainMenuPanel);
        assertNull(tGamePanel);

        System.gc();
    }
}
