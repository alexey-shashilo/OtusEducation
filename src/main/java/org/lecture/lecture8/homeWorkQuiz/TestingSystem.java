package org.lecture.lecture8.homeWorkQuiz;

import org.lecture.lecture8.homeWorkQuiz.question.ConsoleQuestionManager;
import org.lecture.lecture8.homeWorkQuiz.question.QuestionManager;
import org.lecture.lecture8.homeWorkQuiz.quiz.QuizManager;
import org.lecture.lecture8.homeWorkQuiz.quiz.ConsoleQuizManager;
import org.lecture.lecture8.homeWorkQuiz.user.ConsoleUserManager;
import org.lecture.lecture8.homeWorkQuiz.user.User;
import org.lecture.lecture8.homeWorkQuiz.user.UserManager;

import java.util.Scanner;

public class TestingSystem {
    private final Scanner scanner = new Scanner(System.in);
    private final User currentUser = new User("admin");
    private final UserManager userManager = new ConsoleUserManager();
    private final QuestionManager questionManager = new ConsoleQuestionManager();
    private final QuizManager quizManager = new ConsoleQuizManager();


    public void startSystem() {
        userManager.add(currentUser);
        ConsoleQuestionManager consoleQuestionManager = new ConsoleQuestionManager();
        selectMenu();
    }

    public void showMenu() {
        System.out.println("Press");
        System.out.println("1 - start test");
        System.out.println("2 - go to work with users");
        System.out.println("3 - go to work with questions");
        System.out.println("0 - exit to system");

    }

    public void selectMenu() {
        int response = -1;
        while (response != 0) {
            showMenu();
            response = scannerInt();
            switch (response) {
                case 1 -> quizManager.startQuiz(currentUser, questionManager);
                case 2 -> userManager.showMenu(currentUser);
                case 3 -> questionManager.showMenu();
            }
        }
    }

    private int scannerInt() {
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }
}
