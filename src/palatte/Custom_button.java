/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palatte;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author XuanN
 */
public class Custom_button extends JButton{

    private int round = 0;
    private Color bgColor = Color.WHITE;
    public Custom_button() {
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(0, 0 , 0, 0));
    }
    
    public void set_bgColor(Color newColor){
        this.bgColor = newColor;
    }
    
    public void set_round(int round){
        this.round = round;
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, round, round));
        g2.setColor(bgColor);
        g2.fill(area);
        g2.dispose();
        super.paintComponent(g);
        
    }

    
    
}
