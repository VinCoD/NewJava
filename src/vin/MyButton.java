package vin;

import java.awt.Color;
import javax.swing.JButton;

public class MyButton extends JButton {
    MyButton(String name) {
        if (name.equals("call")) {
            this.setBackground(Color.green);
            this.setText("Start Call");
            this.setBounds(0, 250, 100, 50);
        } else {
            this.setBackground(Color.red);
            this.setText("End Call");
            this.setBounds(250, 250, 100, 50);
            this.setEnabled(false);
        }

        this.setFocusable(false);
        this.setForeground(Color.black);
        this.setVisible(true);
    }
}
