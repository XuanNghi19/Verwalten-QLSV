/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palatte;

/**
 *
 * @author XuanN
 */
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class ModernScrollBarUI extends BasicScrollBarUI {

    private int THUMB_SIZE = 5;
    private Color THUMB_COLOR = Color.decode("#009AF9");
    private float ALPHA = 0.7f;
        
    public ModernScrollBarUI(int THUMB_SIZE, Color THUMB_COLOR, float ALPHA) {
        this.THUMB_SIZE = THUMB_SIZE;
        this.THUMB_COLOR = THUMB_COLOR;
        this.ALPHA = ALPHA;
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return new InvisibleScrollBarButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return new InvisibleScrollBarButton();
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
    }

    @Override
    public Dimension getMaximumThumbSize() {
        return new Dimension(0, (int) (scrollbar.getHeight() * 0.4f));
    }

    @Override
    protected Dimension getMinimumThumbSize() {
        return new Dimension(0, 75);
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        if (scrollbar.getVisibleAmount() != scrollbar.getMaximum()) {
            int orientation = scrollbar.getOrientation();
            int x = thumbBounds.x + (orientation == JScrollBar.VERTICAL ? 0 : 8);
            int y = thumbBounds.y + (orientation == JScrollBar.VERTICAL ? 8 : 0);
            int width = orientation == JScrollBar.VERTICAL ? THUMB_SIZE : thumbBounds.width - 16;
            width = Math.max(width, THUMB_SIZE);
            int height = orientation == JScrollBar.VERTICAL ? thumbBounds.height - 16 : THUMB_SIZE;
            height = Math.max(height, THUMB_SIZE);
            Graphics2D graphics2D = (Graphics2D) g.create();
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics2D.setColor(THUMB_COLOR);
            graphics2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, ALPHA));
            graphics2D.fillRoundRect(x, y, width, height, 5, 5);
            graphics2D.dispose();
        }
    }

    private static class InvisibleScrollBarButton extends JButton {

        private InvisibleScrollBarButton() {
            init();
        }

        private void init() {
            setOpaque(true);
            setFocusable(false);
            setFocusPainted(false);
            setBorderPainted(false);
            setBorder(BorderFactory.createEmptyBorder());
        }
    }
}