/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect.four.gui;

import connect.four.Game;


public class MainMenuPanel extends javax.swing.JPanel {

    private String name1, name2;
    GUI gui;
    private boolean isEnabled;
    private boolean isComputerVComputerEnabled;

    public MainMenuPanel(GUI gui) {
        initComponents();
        setSize(1280, 800);
        this.gui = gui;
        isEnabled = false;
        isComputerVComputerEnabled = false;

        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        tfplayer1 = new javax.swing.JTextField();
        tfplayer2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        butPlay = new javax.swing.JButton();
        jtCvsCToggle = new javax.swing.JToggleButton();
        jtComputerToggle1 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(0, 0, 0));

        title.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Connect Four");

        tfplayer1.setText("Player 1");
        tfplayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfplayer1ActionPerformed(evt);
            }
        });

        tfplayer2.setText("Player 2");
        tfplayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfplayer2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player 1:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player 2:");

        butPlay.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        butPlay.setText("PLAY");
        butPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPlayActionPerformed(evt);
            }
        });

        jtCvsCToggle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jtCvsCToggle.setText("Computer vs Computer");
        jtCvsCToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCvsCToggleActionPerformed(evt);
            }
        });

        jtComputerToggle1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jtComputerToggle1.setText("Play Against Computer");
        jtComputerToggle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtComputerToggle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfplayer1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(379, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(title)
                                                .addGap(471, 471, 471))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(butPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jtCvsCToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(514, 514, 514))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(534, 534, 534)
                                        .addComponent(jtComputerToggle1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(514, 514, 514)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(title)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(90, 90, 90)
                                .addComponent(jtCvsCToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(301, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(285, 285, 285)
                                        .addComponent(jtComputerToggle1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(463, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfplayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfplayer2ActionPerformed

    }//GEN-LAST:event_tfplayer2ActionPerformed

    private void tfplayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfplayer1ActionPerformed

    }//GEN-LAST:event_tfplayer1ActionPerformed

    private void butPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPlayActionPerformed
        gui.setPlayer1Name(tfplayer1.getText());
        gui.setPlayer2Name(tfplayer2.getText());
        //gui.game.start();
        gui.remove(this);
        gui.addGamePanel();
        gui.updateDisplay();
    }//GEN-LAST:event_butPlayActionPerformed

    private void jtCvsCToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCvsCToggleActionPerformed
        if (!isComputerVComputerEnabled) {
            tfplayer1.setText("Computer 1");
            tfplayer1.setEditable(false);
            tfplayer2.setText("Computer 2");
            tfplayer2.setEditable(false);
            isComputerVComputerEnabled = true;
        } else {
            tfplayer1.setText("Player 1");
            tfplayer1.setEditable(true);
            tfplayer2.setText("Player 2");
            tfplayer2.setEditable(true);
            isComputerVComputerEnabled = false;
        }
    }//GEN-LAST:event_jtCvsCToggleActionPerformed

    private void jtComputerToggle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtComputerToggle1ActionPerformed
        if (isComputerVComputerEnabled) {
            tfplayer1.setText("Player 1");
            tfplayer1.setEditable(true);
            tfplayer2.setText("Player 2");
            tfplayer2.setEditable(true);
            isComputerVComputerEnabled = false;
        }

        if (!isEnabled) {
            tfplayer2.setText("Computer");
            tfplayer2.setEditable(false);
            isEnabled = true;
        } else {
            tfplayer2.setText("Player 2");
            tfplayer2.setEditable(true);
            isEnabled = false;
        }
    }//GEN-LAST:event_jtComputerToggle1ActionPerformed

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public boolean getIsCvCEnabled() {
        return isComputerVComputerEnabled;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jtComputerToggle1;
    private javax.swing.JToggleButton jtCvsCToggle;
    private javax.swing.JTextField tfplayer1;
    private javax.swing.JTextField tfplayer2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
