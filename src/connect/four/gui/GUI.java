/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect.four.gui;

public class GUI extends javax.swing.JFrame {

    private MainMenuPanel mainMenu;
    private GamePanel gamePanel;
    private GameOverPanel gameOverPanel;
    private String p1Name;
    private String p2Name;
    private String winner;
    private int score1;
    private int score2;

    public GUI() {
        initComponents();
        score1 = 0;
        score2 = 0;
        //gamePanel = new GamePanel(this);
        mainMenu = new MainMenuPanel(this);
        add(mainMenu);

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

		/* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Methods

    public void updateDisplay() {

        revalidate();
        repaint();
    }

    public String getPlayer1Name() {
        return p1Name;
    }

    public void setPlayer1Name(String name) {
        p1Name = name;
        System.out.println("Player 1's name set to " + name);
    }

    public String getPlayer2Name() {
        return p2Name;
    }

    public void setPlayer2Name(String name) {
        p2Name = name;
        System.out.println("Player 2's name set to " + name);
    }

    public void addGamePanel() {
        gamePanel = new GamePanel(this, mainMenu.getIsEnabled(), mainMenu.getIsCvCEnabled());
        add(gamePanel);
    }

    public void removeGamePanel() {
        remove(gamePanel);
    }

    public void addMainMenu() {
        score1 = 0;
        score2 = 0;
        mainMenu = new MainMenuPanel(this);
        add(mainMenu);
    }

    public void addGameOver() {
        remove(gamePanel);
        gameOverPanel = new GameOverPanel(this, winner);
        add(gameOverPanel);
        updateDisplay();
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int newScore) {
        score1 = newScore;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int newScore) {
        score2 = newScore;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
