package org.lecture.lecture16.homework.game;

public class Player {
    private final String name;
    private int roll;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }
}
