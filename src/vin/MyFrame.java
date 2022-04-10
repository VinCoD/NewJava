package vin;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {
    String title = "Call Details";
    MyLabel label = new MyLabel();
    MyTextField enterNumber = new MyTextField();
    MyButton callButton = new MyButton("call");
    MyButton hangButton = new MyButton("hang");
    static MyPanel panel = new MyPanel();
    static CheckBox check = new CheckBox();

    MyFrame() {
        this.setLayout((LayoutManager)null);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setSize(370, 400);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.add(this.label);
        this.add(this.enterNumber);
        this.add(this.callButton);
        this.callButton.addActionListener(this);
        this.add(this.hangButton);
        this.hangButton.addActionListener(this);
        this.add(panel);
        this.add(check);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.callButton) {
            if (this.enterNumber.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter phone number to continue");
            } else {
                panel.Start();
                this.callButton.setEnabled(false);
                this.hangButton.setEnabled(true);
            }
        }

        if (e.getSource() == this.hangButton) {
            panel.Stop();
            this.callButton.setEnabled(true);
            this.hangButton.setEnabled(false);
            bill callBill = new bill();
            String var10001 = panel.isDay();
            JOptionPane.showMessageDialog(this, "period: " + var10001 + "\nsame network: " + check.isSelected() + "\ncall duration: " + panel.getDuration() + " seconds\nVAT: " + callBill.getVAT() + "\n\ncall bill: " + " Kshs. " + callBill.getTotalCharge());
            panel.Reset();
        }

    }
}
