package org.lecture.lecture16.homework.tests;

import org.lecture.lecture16.homework.game.*;
public class GameTest {

    public void playGameWhenPlayerOneLessPlayerTwoPrintPlayerTwo() {
        Dice dice = new DiceMock(1, 2);
        GameWinnerMock winnerPrinter = new GameWinnerMock();
        Game game = new Game(dice, winnerPrinter);
        Player player1 = new Player("Vasa");
        Player player2 = new Player("Igor");
        game.playGame(player1, player2);
        if (!winnerPrinter.getPlayer().equals(player2)) {
            throw new TestException("Test one has failed");
        }
    }

    public void playGameWhenPlayerTwoLessPlayerOnePrintPlayerOne() {
        Dice dice = new DiceMock(2, 1);
        GameWinnerMock winnerPrinter = new GameWinnerMock();
        Game game = new Game(dice, winnerPrinter);
        Player player1 = new Player("Vasa");
        Player player2 = new Player("Igor");
        game.playGame(player1, player2);
        if (!winnerPrinter.getPlayer().equals(player1)) {
            throw new TestException("Test one has failed");
        }
    }

    public void playGameWhenPlayerTwoDrawReturnNull() {
        Dice dice = new DiceMock(1, 1);
        GameWinnerMock winnerPrinter = new GameWinnerMock();
        Game game = new Game(dice, winnerPrinter);
        Player player1 = new Player("Vasa");
        Player player2 = new Player("Igor");
        game.playGame(player1, player2);
        if (winnerPrinter.getPlayer() != null) {
            throw new TestException("Test one has failed");
        }
    }
}
