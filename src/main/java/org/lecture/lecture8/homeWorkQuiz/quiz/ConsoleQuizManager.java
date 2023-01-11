package org.lecture.lecture8.homeWorkQuiz.quiz;

import org.lecture.lecture8.homeWorkQuiz.question.Question;
import org.lecture.lecture8.homeWorkQuiz.question.QuestionManager;
import org.lecture.lecture8.homeWorkQuiz.question.answer.Answer;
import org.lecture.lecture8.homeWorkQuiz.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleQuizManager implements QuizManager {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Quiz> quizzes = new ArrayList<>();

    @Override
    public boolean check(Question question, String response, User user) {
        for (Answer answer : question.getAnswers()) {
            if (answer.getAnswer().equals(response)) {
                user.incrementRightAnswers();
                return true;
            }
        }
        return false;
    }

    @Override
    public void startQuiz(User user, QuestionManager questionManager) {
        if (!questionManager.isQuestion()) {
            System.out.println("Sorry, no questions yet");
        } else {
            System.out.println("Select question");
            Question question = questionManager.selectQuestion();
            questionManager.showAnswer(question);
            System.out.println("Enter response");
            String response = scanner.nextLine();
            boolean check = check(question, response, user);
            Quiz quiz = new Quiz(user, question, response, check);
            quizzes.add(quiz);
            System.out.println("Press");
            System.out.println("1 - answer one more question");
            System.out.println("0 - return to menu");

            int responseInt = scanner.nextInt();
            if (responseInt == 1) {
                startQuiz(user, questionManager);
            }
        }
    }

    public void add(Quiz quiz) {
        quizzes.add(quiz);
    }
}
