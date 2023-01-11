package org.lecture.lecture8.homeWorkQuiz.user;

public interface UserManager {
    void add(User user);
    void showUsers();
    User showMenu(User user);
    User select();
    void drop();
    void edit();
    User create();
}
