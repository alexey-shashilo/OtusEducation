package org.lecture.lecture8.homeWorkQuiz.question;

import org.lecture.lecture8.homeWorkQuiz.question.answer.Answer;

import java.util.List;

public class Question {
    private String question;
    private List<Answer> answers;

    public Question(String question, List<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }
    public void add(Answer answer){
        answers.add(answer);
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return question;
    }
}
