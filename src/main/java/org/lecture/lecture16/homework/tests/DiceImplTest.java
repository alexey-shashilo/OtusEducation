package org.lecture.lecture16.homework.tests;

import org.lecture.lecture16.homework.game.DiceImpl;

public class DiceImplTest {
    public void checkForBelongingToTheIntervalFromOneToSix() {
        int num;
        for (int i = 0; i < 100; i++) {
            num = new DiceImpl().roll();
            if (num < 1 || num > 6) {
                throw new TestException("num not in range 1 to 6");
            }
        }

    }
}
