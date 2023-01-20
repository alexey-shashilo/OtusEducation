package org.lecture.lecture16.homework.tests;

import org.lecture.lecture16.homework.game.Dice;

public class DiceMock implements Dice {
    private int num1;
    private int num2;

    private int count = 0;

    DiceMock(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int roll() {
        if (count == 0) {
            count++;
            return num1;
        } else {
            return num2;
        }
    }
}
