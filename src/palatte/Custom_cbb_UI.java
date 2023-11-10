/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palatte;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author XuanN
 */
public class Custom_cbb_UI extends BasicComboBoxUI {

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        Border border = new Border();

        // ???
        JTextField txt = (JTextField) comboBox.getEditor().getEditorComponent();
        txt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                border.setColor(new Color(128, 189, 255));
//                border.setColor(Color.RED);
            }

            @Override
            public void focusLost(FocusEvent e) {
                border.setColor(new Color(206, 212, 218));
//                border.setColor(Color.YELLOW);
            }

        });

        comboBox.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                arrowButton.setBackground(new Color(180, 180, 180));
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                arrowButton.setBackground(new Color(150, 150, 150));
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
                arrowButton.setBackground(new Color(150, 150, 150));
            }

        });
        AutoCompleteDecorator.decorate(comboBox);
        txt.setSelectionColor(new Color(0, 154, 249));
        comboBox.setBackground(Color.white);
        comboBox.setForeground(Color.black);
        comboBox.setBorder(border);
    }

    @Override
    protected JButton createArrowButton() {
        return new ArrowButton();
    }

    @Override
    protected ComboPopup createPopup() {
        return new Custom_cbb_popup(comboBox);
    }

    @Override
    protected ListCellRenderer<Object> createRenderer() {
        return new ListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                String text = value == null ? "" : value.toString();
                JLabel label = new JLabel(text);
                label.setFont(comboBox.getFont());
                
                if(index >= 0) {
                    label.setBorder(new EmptyBorder(5, 8, 5, 8));
                } else {
                    label.setBorder(null);
                }
                
                if(isSelected) {
                    label.setOpaque(true);
                    label.setBackground(new Color(0, 154, 249));
                    label.setForeground(Color.white);
                } 
                return label;
            }
            
        };
    }
    
    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {

    }

    private class Custom_cbb_popup extends BasicComboPopup {

        public Custom_cbb_popup(JComboBox<Object> combo) {
            super(combo);
            setBorder(new Border(1));
        }

        @Override
        protected JScrollPane createScroller() {
            JScrollPane scroll = super.createScroller();
            list.setBackground(Color.white);
            Custom_scrollBar csb = new Custom_scrollBar(5, Color.decode("#009AF9"), 0.7f);
            csb.setPreferredSize(new Dimension(5, 70));
            scroll.setVerticalScrollBar(csb);
            return scroll;
        }

    }

    private class ArrowButton extends JButton {

        public ArrowButton() {
            setContentAreaFilled(false);
            setBorder(new EmptyBorder(5, 5, 5, 5));
            setBackground(new Color(150, 150, 150));

        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int width = getWidth();
            int height = getHeight();
            int sizeX = 12;
            int sizeY = 8;
            int x = (width - sizeX) / 2;
            int y = (height - sizeY) / 2;
            int px[] = {x, x + sizeX, x + sizeX / 2};
            int py[] = {y, y, y + sizeY};
            g2.setColor(getBackground());
            g2.fillPolygon(px, py, px.length);
            g2.dispose();
        }
    }

    private class Border extends EmptyBorder {

        private Color focusColor = new Color(128, 189, 255);

        public Color getFocusColor() {
            return focusColor;
        }

        public void setFocusColor(Color focusColor) {
            this.focusColor = focusColor;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }
        private Color color = new Color(206, 212, 218);

        public Border(int border) {
            super(border, border, border, border);
        }

        public Border() {
            this(5);
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();

            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            if (c.isFocusOwner()) {
                g2.setColor(focusColor);
            } else {
                g2.setColor(color);
            }
            g2.drawRect(x, y, width - 1, height - 1);
            g2.dispose();
        }

    }

}
