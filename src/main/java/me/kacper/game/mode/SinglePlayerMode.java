package me.kacper.game.mode;

public interface SinglePlayerMode {

    String username();
    String skin();
    int points();
    void createInterface(String title, int width, int height);
}
