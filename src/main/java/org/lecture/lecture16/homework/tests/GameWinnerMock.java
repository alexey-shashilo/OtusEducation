package org.lecture.lecture16.homework.tests;

import org.lecture.lecture16.homework.game.GameWinnerPrinter;
import org.lecture.lecture16.homework.game.Player;

import java.util.ArrayList;
import java.util.List;

public class GameWinnerMock implements GameWinnerPrinter {
    private Player player;

    @Override
    public void printWinner(Player winner) {
            player = winner;
    }

    public Player getPlayer() {
        return player;
    }
}
