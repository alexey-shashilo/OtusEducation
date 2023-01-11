package org.lecture.lecture8.homeWorkQuiz.question;

import org.lecture.lecture8.homeWorkQuiz.question.answer.Answer;

public interface QuestionManager {
    void showMenu();

    void showQuestion();

    void showAnswer(Question question);

    Question createQuestion();

    void dropQuestion();

    void dropAnswer();

    void editQuestion();

    Question selectQuestion();

    Answer selectAnswer(Question question);

    boolean isQuestion();

    void add(Question question);
}
