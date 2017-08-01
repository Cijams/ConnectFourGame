package connect.four.test;


import connect.four.Game;
import connect.four.ScoreChart;
import connect.four.board.Board;
import connect.four.gui.*;
import connect.four.player.ComputerPlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Chris on 7/31/2017.
 */
public class testGUI {
    GUI tGUI;
    GameOverPanel tGameOverPanel;
    GamePanel tGamePanel;
    Board tBoard;
    GUIPiece tGUIPiece;

    MainMenuPanel tMainMenuPanel;

    @Before
    public void setUp() throws Exception {
        tGUI = new GUI();
        tGameOverPanel = new GameOverPanel(tGUI, "Chris");
        tGamePanel = new GamePanel(tGUI, true);
        tBoard = new Board(5,5);
      //  tGUIPiece = new GUIPiece(5);

    }

    @Test
    public void testGameOverPanel() {
        assertNotNull(tGameOverPanel);
    }

    @Test
    public void testGamePanel() {
        tGamePanel.getTargetY();
        tGamePanel.isValidMove();
        tGamePanel.getColumnNum();
        tGamePanel.calcWidth(5);
    }


    @After
    public void tearDown() throws Exception {

    }
}
