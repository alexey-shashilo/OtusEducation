package org.lecture.lecture8.homeWorkQuiz.question.answer;

import java.util.Scanner;

public class ConsoleAnswerManager implements AnswerManager {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Answer create() {
        System.out.println("Enter variable response");
        return new Answer(scannerStr());
    }

    @Override
    public void edit(Answer answer) {
        System.out.println("Enter new variable response");
        answer.setAnswer(scannerStr());
    }

    private String scannerStr() {
        return scanner.nextLine();
    }
}
