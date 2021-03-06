/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect.four.gui;

import javax.swing.*;


public class GUIPiece extends JLabel {

    private final int glowNum;
    private final ImageIcon glow1;
    private final ImageIcon glow2;
    private final ImageIcon glow3;
    private final ImageIcon glow4;
    private final ImageIcon[] glowing;

    public GUIPiece(int playerNum) {
        setSize(145, 145);
        setOpaque(false);
        setText("");
        ImageIcon redIcon = new ImageIcon(getClass().getResource("/connect/four/gui/Images/red_glow/glow1.png"));
        ImageIcon blueIcon = new ImageIcon(getClass().getResource("/connect/four/gui/Images/blue_glow/glow1.png"));
        if (playerNum == 0) {
            setIcon(redIcon);
            glowNum = 0;
            glow1 = new ImageIcon(getClass().getResource("/connect/four/gui/Images/red_glow/glow1.png"));
            glow2 = new ImageIcon(getClass().getResource("/connect/four/gui/Images/red_glow/glow2.png"));
            glow3 = new ImageIcon(getClass().getResource("/connect/four/gui/Images/red_glow/glow3.png"));
            glow4 = new ImageIcon(getClass().getResource("/connect/four/gui/Images/red_glow/glow4.png"));
        } else {
            setIcon(blueIcon);
            glowNum = 1;
            glow1 = new ImageIcon(getClass().getResource("/connect/four/gui/Images/blue_glow/glow1.png"));
            glow2 = new ImageIcon(getClass().getResource("/connect/four/gui/Images/blue_glow/glow2.png"));
            glow3 = new ImageIcon(getClass().getResource("/connect/four/gui/Images/blue_glow/glow3.png"));
            glow4 = new ImageIcon(getClass().getResource("/connect/four/gui/Images/blue_glow/glow4.png"));
        }

        glowing = new ImageIcon[]{glow1, glow2, glow3, glow4, glow3, glow2};
        revalidate();
        repaint();
        setVisible(true);
    }

    ImageIcon getGlow(int index) {
        return glowing[index];
    }


}
