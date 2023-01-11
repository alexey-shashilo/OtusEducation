package org.lecture.lecture8.homeWorkQuiz.user;

import java.util.Objects;

public class User {
    private String fullName;
    private int rightAnswers;

    public User(String fullName) {
        this.fullName = fullName;
    }

    public void showRightAnswers(User user) {
        System.out.println("Вы ответили верно на " + user.rightAnswers + "вопросов");
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void incrementRightAnswers() {
        this.rightAnswers++;
    }

    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(fullName, user.fullName);
    }
}