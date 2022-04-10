package vin;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel {
    JLabel timeLabel;
    int counter = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    String seconds_string;
    String minutes_string;
    String hours_string;
    public Timer timer;

    MyPanel() {
        this.seconds_string = String.format("%02d", this.seconds);
        this.minutes_string = String.format("%02d", this.minutes);
        this.hours_string = String.format("%02d", this.hours);
        this.timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyPanel.this.counter += 1000;
                MyPanel.this.hours = MyPanel.this.counter / 3600000;
                MyPanel.this.minutes = MyPanel.this.counter / '\uea60' % 60;
                MyPanel.this.seconds = MyPanel.this.counter / 1000 % 60;
                MyPanel.this.seconds_string = String.format("%02d", MyPanel.this.seconds);
                MyPanel.this.minutes_string = String.format("%02d", MyPanel.this.minutes);
                MyPanel.this.hours_string = String.format("%02d", MyPanel.this.hours);
                MyPanel.this.timeLabel.setText(MyPanel.this.hours_string + ":" + MyPanel.this.minutes_string + ":" + MyPanel.this.seconds_string);
            }
        });
        this.setBackground(Color.lightGray);
        this.setBounds(101, 90, 149, 150);
        this.setVisible(true);
        this.setLayout((LayoutManager)null);
        JLabel durationLabel = new JLabel();
        durationLabel.setText("Duration ");
        durationLabel.setBounds(35, 50, 100, 20);
        durationLabel.setForeground(Color.black);
        durationLabel.setBackground(Color.green);
        this.timeLabel = new JLabel();
        this.timeLabel.setText(this.hours_string + ":" + this.minutes_string + ":" + this.seconds_string);
        this.timeLabel.setBounds(0, 90, 149, 70);
        this.timeLabel.setFont(new Font("Verdana", 0, 20));
        this.timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        this.timeLabel.setOpaque(true);
        this.timeLabel.setHorizontalAlignment(0);
        this.add(durationLabel);
        this.add(this.timeLabel);
    }

    public void Start() {
        this.timer.start();
    }

    public void Stop() {
        this.timer.stop();
    }

    public void Reset() {
        this.counter = 0;
        this.seconds = 0;
        this.minutes = 0;
        this.hours = 0;
        this.seconds_string = String.format("%02d", this.seconds);
        this.minutes_string = String.format("%02d", this.minutes);
        this.hours_string = String.format("%02d", this.hours);
        this.timeLabel.setText(this.hours_string + ":" + this.minutes_string + ":" + this.seconds_string);
    }

    public int getDuration() {
        return this.counter / 1000;
    }

    public String isDay() {
        Date time = new Date();
        int startHour = time.getHours();
        return startHour >= 6 && startHour < 18 ? "DayTime" : "Night";
    }
}

