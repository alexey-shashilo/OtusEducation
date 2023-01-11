package org.lecture.Lecture12;

import java.util.Scanner;

public class AccountManager implements AccountManagement {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Account create() {
        System.out.println("Введите номер счета");
        int response = scannerInt();
        Account account = new Account(response);
        System.out.println("Вы хотите пополнить свой счет?");
        System.out.println("1 - да");
        System.out.println("0 - нет");
        response = scannerInt();
        if (response == 1) {
            replenishTheBalance(account);
        }
        return account;
    }

    @Override
    public void replenishTheBalance(Account account) {
        System.out.println("Введите сумму пополнения");
        double sum = scannerDouble();
        account.setBalance(account.getBalance() + sum);
    }

    private int scannerInt() {
        int response = scanner.nextInt();
        scanner.nextLine();
        return response;
    }

    private double scannerDouble() {
        double response = scanner.nextDouble();
        scanner.nextLine();
        return response;
    }
}
