package org.lecture.lecture8.homeWorkQuiz.quiz;

import org.lecture.lecture8.homeWorkQuiz.question.Question;
import org.lecture.lecture8.homeWorkQuiz.question.QuestionManager;
import org.lecture.lecture8.homeWorkQuiz.user.User;

public interface QuizManager {
    boolean check(Question question, String response, User user);
    void startQuiz(User user, QuestionManager questionManager);

}
