package vin;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MyTextField extends JTextField {
    MyTextField() {
        this.setVisible(true);
        this.setBackground(Color.white);
        this.setBounds(150, 5, 200, 40);
        this.setBorder(new EmptyBorder(10,10,10,10));
        this.setForeground(Color.black);
        this.setFont(new Font((String)null, 0, 20));
    }
}
