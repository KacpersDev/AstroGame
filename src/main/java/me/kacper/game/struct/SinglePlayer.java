package me.kacper.game.struct;

import lombok.Getter;
import me.kacper.game.impl.GameTime;
import me.kacper.game.mode.SinglePlayerMode;
import me.kacper.player.Player;

import javax.swing.*;
import java.awt.*;

@Getter
public class SinglePlayer implements SinglePlayerMode {

    private final JFrame frame;
    private final JPanel panel;
    private int points;
    private String skin;
    private String username;
    private final Player player;
    private final GameTime time;
    private final JLabel timer;

    public SinglePlayer(){

        this.frame = new JFrame();
        this.panel = new JPanel();
        this.player = new Player(getUsername());
        this.timer = new JLabel();
        this.time = new GameTime();
    }

    @Override
    public String username() {
        return username;
    }

    @Override
    public String skin() {
        return skin;
    }

    @Override
    public int points() {
        return points;
    }

    @Override
    public void createInterface(String title, int width, int height) {
        panel.setBackground(Color.BLACK);
        time.calculateTime(timer, panel);
        frame.add(panel);
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
