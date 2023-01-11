package org.lecture.lecture16.homework;


import org.lecture.lecture16.homework.game.*;
import org.lecture.lecture16.homework.tests.DiceImplTest;
import org.lecture.lecture16.homework.tests.GameTest;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        GameTest gameTest = new GameTest();
        DiceImplTest diceImplTest = new DiceImplTest();
        //Тесты game
        gameTest.playGameWhenPlayerOneLessPlayerTwoPrintPlayerTwo();
        gameTest.playGameWhenPlayerTwoLessPlayerOnePrintPlayerOne();
        gameTest.playGameWhenPlayerTwoDrawReturnNull();
        //Тест DiceImpl
        diceImplTest.checkForBelongingToTheIntervalFromOneToSix();
    }

}