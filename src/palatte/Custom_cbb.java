/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palatte;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author XuanN
 */
public class Custom_cbb<E> extends JComboBox<E>{

    public Custom_cbb() {
        setUI(new Custom_cbb_UI());
    }

}
