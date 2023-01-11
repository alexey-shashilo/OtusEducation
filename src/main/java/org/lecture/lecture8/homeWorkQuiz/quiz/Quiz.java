package org.lecture.lecture8.homeWorkQuiz.quiz;

import org.lecture.lecture8.homeWorkQuiz.question.Question;
import org.lecture.lecture8.homeWorkQuiz.user.User;

public class Quiz {
    private User user;
    private Question question;
    private String response;
    private boolean correctResponse;

    Quiz(User user, Question question, String response, boolean correctResponse) {
        this.user = user;
        this.question = question;
        this.response = response;
        this.correctResponse = correctResponse;
    }

    public void setCorrectResponse(boolean correctResponse) {
        this.correctResponse = correctResponse;
    }

    public boolean isCorrectResponse() {
        return correctResponse;
    }

    public String getResponse() {
        return response;
    }

    public User getUser() {
        return user;
    }

    public Question getQuestion() {
        return question;
    }
}
