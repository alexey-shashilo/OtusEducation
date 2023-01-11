package org.lecture.lecture16.homework;

import org.lecture.lecture16.homework.game.*;

public class Demo {

    public static void main(String[] args) {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("Vasya", dice.roll()), new Player("Igor", dice.roll()));
    }
}
