/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palatte;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

/**
 *
 * @author XuanN
 */
public class Custom_tb extends JTable {

    public Custom_tb() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);

        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                header.setFont(new Font("Arial", Font.PLAIN, 20));
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                setBorder(noFocusBorder);
                setHorizontalAlignment(CENTER);

                if (selected) {
                    if (i % 2 != 0) {
                        com.setBackground(Color.decode("#B2BAFF"));
                    } else {
                        com.setBackground(Color.decode("#9EA8FF"));
                    }

                } else {
                    if (i % 2 != 0) {
                        com.setBackground(Color.decode("#F1F1F1"));
                    } else {
                        com.setBackground(Color.white);
                    }
                }
                return com;
            }
        });
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }

    public void fixTable(JScrollPane scroll) {
        scroll.setBorder(null);
        Custom_scrollBar csb = new Custom_scrollBar(5, Color.decode("#009AF9"), 0.7f);
        csb.setPreferredSize(new Dimension(5, 70));
        scroll.setVerticalScrollBar(csb);
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setBackground(Color.white);
        JPanel p = new JPanel();
        p.setBackground(Color.decode("#FF8A00"));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }

    public class TableHeader extends JLabel {

        public TableHeader(String text) {
            super(text);
            setPreferredSize(new Dimension(0, 52));
            setHorizontalAlignment(JLabel.CENTER);
            setOpaque(true);
            setBackground(Color.decode("#FF8A00"));
            setFont(new Font("sansserif", 1, 12));
            setForeground(Color.white);
            setBorder(new EmptyBorder(10, 5, 10, 5));
        }

        @Override
        protected void paintComponent(Graphics grphcs) {
            super.paintComponent(grphcs);
            grphcs.setColor(new Color(230, 230, 230));
            grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        }
    }
}
