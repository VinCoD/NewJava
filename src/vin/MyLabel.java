package vin;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class MyLabel extends JLabel {
    MyLabel() {
        this.setBounds(2, 5, 140, 40);
        this.setText("Phone No.");
        this.setFont(new Font("TIMES NEW ROMAN", 0, 30));
        this.setBackground(Color.LIGHT_GRAY);
        this.setForeground(Color.BLACK);
        this.setOpaque(true);
        this.setVisible(true);
    }
}
