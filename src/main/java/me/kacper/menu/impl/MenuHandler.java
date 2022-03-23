package me.kacper.menu.impl;

import lombok.Getter;
import me.kacper.game.struct.SinglePlayer;
import me.kacper.menu.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Getter
public class MenuHandler implements Menu, ActionListener {

    private final String title;
    private final int width;
    private final int height;
    private final JFrame frame;
    private final JPanel panel;
    private final JLabel userName;
    private final JButton singlePlayer;
    private final JButton multiPlayer;
    private final JTextField textField;
    private final SinglePlayer singlePlayerClass;

    public MenuHandler(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.userName = new JLabel();
        this.singlePlayer = new JButton();
        this.multiPlayer = new JButton();
        this.textField = new JTextField();
        this.singlePlayerClass = new SinglePlayer();
    }

    @Override
    public String title() {
        return title;
    }

    @Override
    public int width() {
        return width;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public void init() {

        textField.setText("Please enter your username");
        singlePlayer.setText("SinglePlayer");
        multiPlayer.setText("MultiPlayer");
        panel.add(textField);
        panel.add(singlePlayer);
        singlePlayer.setActionCommand("singleplayer");
        multiPlayer.setActionCommand("multiplayer");
        singlePlayer.addActionListener(this);
        multiPlayer.addActionListener(this);
        panel.add(multiPlayer);
        panel.setBackground(Color.BLACK);
        frame.add(panel);
        frame.setTitle(title());
        frame.setSize(width(), height());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equalsIgnoreCase("singleplayer")) {
            this.frame.setVisible(false);
            this.singlePlayerClass.createInterface("Astra", 500, 500);
        } else if (e.getActionCommand().equalsIgnoreCase("multiplayer")) {
            System.out.println("multiplayer");
        }
    }
}
