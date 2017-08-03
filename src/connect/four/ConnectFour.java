package connect.four;

import connect.four.board.Board;
import connect.four.player.ComputerPlayer;
import connect.four.player.ConsolePlayer;
import connect.four.player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConnectFour {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Player's name: ");
        ConsolePlayer p1 = new ConsolePlayer(stdin.readLine());
        System.out.print("How many players (1/2)?");
        Player p2;
        if (stdin.readLine().equals("1")) {
            p2 = new ComputerPlayer();
        } else {
            System.out.print("Other player's name: ");
            p2 = new ConsolePlayer(stdin.readLine());
        }
        Game game = new Game(new Player[]{p1, p2}, new Board(7, 6), 4);
        game.registerListener(p1);
        if (p2 instanceof ScoreChart.Listener) game.registerListener((ScoreChart.Listener) p2);
        game.start();
    }

}
