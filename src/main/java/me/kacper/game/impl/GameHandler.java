package me.kacper.game.impl;

import lombok.Getter;
import me.kacper.game.Game;
import me.kacper.game.type.GameType;

import javax.swing.*;

@Getter
public class GameHandler implements Game {

    private final String title;
    private final int width;
    private final int height;
    private final JFrame frame;
    private final JPanel panel;

    public GameHandler(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;
        this.frame = new JFrame();
        this.panel = new JPanel();
    }

    @Override
    public GameType type() {
        return GameType.SINGLEPLAYER;
    }

    public void init(){


    }
}
