package me.kacper.game.impl;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

@Getter
public class GameTime {

    private final Timer timer;
    private final int seconds = 60;
    private int minutes = 0;
    //private int i;

    public GameTime(){
        this.timer = new Timer();
    }

    public void calculateTime(JLabel label, JPanel panel){

        label.setBounds(150,0,200,25);
        label.setMinimumSize(new Dimension(200, 25));
        label.setMaximumSize(new Dimension(200, 25));

        timer.schedule(new TimerTask() {

            int i = 0;

            @Override
            public void run() {

                i++;

                if (i == seconds) {
                    minutes = minutes + 1;
                    i = 0;
                }

                System.out.println("Minutes " + minutes + " Seconds " + i);


                if (minutes == 0) {
                    label.setText("Time: " + "Seconds " + i);
                } else {
                    label.setText("Time: " + "Minutes " + minutes + " Seconds " + i);
                }
                panel.add(label);
                label.setOpaque(true);

            }
        },100L,1000L);

    }
}
