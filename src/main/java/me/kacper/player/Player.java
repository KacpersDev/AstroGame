package me.kacper.player;

import lombok.Getter;

@Getter
public class Player {

    private final String userName;
    private int points = 0;

    public Player(String userName){

        this.userName = userName;
    }

    public void generatePlayer(){

    }

    public int setPoints(int amount){
        return this.points = amount;
    }

    public int removePoints(int amount) {
        return this.points = this.points - amount;
    }
}
