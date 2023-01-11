package org.lecture.lecture8.homeWorkQuiz.question.answer;


public class Answer {
    private String answer;
    private boolean correct;

    public Answer(String answer) {
        this.answer = answer;
        this.correct = false;
    }

    public Answer(String answer, boolean bool) {
        this.answer = answer;
        this.correct = bool;
    }

    public void setCorrect() {
        this.correct = true;
    }

    public boolean inCorrect() {
        return correct;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return answer;
    }
}
