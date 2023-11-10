/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palatte;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author XuanN
 */
public class Custom_scrollBar extends JScrollBar {

    public Custom_scrollBar(int THUMB_SIZE, Color THUMB_COLOR, float ALPHA) {
        setUI(new ModernScrollBarUI(THUMB_SIZE, THUMB_COLOR, ALPHA));
        setPreferredSize(new Dimension(5, 5));
        setOpaque(false);
        setUnitIncrement(20);
    }
}
