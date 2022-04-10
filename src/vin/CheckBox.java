package vin;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;

public class CheckBox extends JCheckBox {
    CheckBox() {
        this.setText("Same Network");
        this.setBackground(Color.LIGHT_GRAY);
        this.setForeground(Color.black);
        this.setVisible(true);
        this.setFont(new Font((String)null, 1, 15));
        this.setBounds(40, 45, 300, 30);
        this.setFocusable(false);
    }
}

