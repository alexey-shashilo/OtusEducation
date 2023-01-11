package org.lecture.lecture16.homework.tests;

import org.lecture.lecture16.homework.game.Dice;

public class DiceImplementResult1Spy implements Dice {
    @Override
    public int roll() {
        return 1;
    }
}
