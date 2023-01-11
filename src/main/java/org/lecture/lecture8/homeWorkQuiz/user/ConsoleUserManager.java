package org.lecture.lecture8.homeWorkQuiz.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleUserManager implements UserManager {
    private final Scanner scanner = new Scanner(System.in);
    private final List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public User showMenu(User user) {
        int response = -1;
        while (response != 0) {
            System.out.println("Press");
            System.out.println("1 - print all users");
            System.out.println("2 - create user");
            System.out.println("3 - edit user");
            System.out.println("4 - delete user");
            System.out.println("5 - select user");
            System.out.println("0 - return to menu");

            response = scannerInt();
            switch (response) {
                case 1 -> showUsers();
                case 2 -> create();
                case 3 -> edit();
                case 4 -> drop();
                case 5 -> user = select();
            }
        }
        return user;
    }

    @Override
    public void showUsers() {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println("User number " + (i + 1) + ": " + user);
        }
    }

    @Override
    public User create() {
        System.out.println("Enter name user");
        String response = scannerStr();
        if (response.equals(users.get(0).getFullName())) {
            System.out.println("Admin cannot be changed");
            return users.get(0);
        } else {
            User user = new User(response);
            users.add(user);
            return user;
        }
    }

    @Override
    public User select() {
        showUsers();
        System.out.println("Enter user number to select");
        int response = scannerInt() - 1;
        return users.get(response);
    }

    @Override
    public void edit() {
        User user = select();
        if (user.equals(users.get(0))) {
            System.out.println("Admin cannot be changed");
        } else {
            System.out.println("Current name user: " + user);
            System.out.println("Enter new name user ");
            String response = scannerStr();
            user.setFullName(response);
        }
    }

    @Override
    public void drop() {
        User user = select();
        if (user.equals(users.get(0))) {
            System.out.println("Admin can't be deleted");
        } else {
            users.remove(user);
        }
    }

    private String scannerStr() {
        return scanner.nextLine();
    }

    private int scannerInt() {
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }
}
