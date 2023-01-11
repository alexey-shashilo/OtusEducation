package org.lecture.lecture16.homework.game;

public class Game {
    private final GameWinnerPrinter winnerPrinter;
    private final  Dice dice;

    public Game(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.winnerPrinter = winnerPrinter;
        this.dice = dice;
    }


    public void playGame(Player player1, Player player2) {
        player1.setRoll(dice.roll());
        player2.setRoll(dice.roll());

        Player winner = (player1.getRoll() > player2.getRoll()) ? player1 : player2;
        winnerPrinter.printWinner(winner);
    }
}
