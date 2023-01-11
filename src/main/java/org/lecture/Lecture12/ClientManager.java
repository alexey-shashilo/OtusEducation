package org.lecture.Lecture12;

import java.util.Scanner;

public class ClientManager implements ClientManagement {
    private final Scanner scanner = new Scanner(System.in);
    private final AccountManager accountManager = new AccountManager();
    private final Bank bank;

    public ClientManager(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void create() {
        System.out.println("Введите имя пользователя");
        String name = scannerStr();
        System.out.println("Введите год рождения ");
        int yearOfBirth = scannerInt();
        Client client = new Client(name, yearOfBirth);
        System.out.println("Вы хотите открыть счет?");
        System.out.println("1 - да");
        System.out.println("0 - нет");
        int response = scannerInt();
        while (response == 1) {
            Account account = accountManager.create();
            bank.putAccountMap(client, account);
            bank.putClientMap(account, client);
            System.out.println("Вы хотите открыть еще один счет?");
            System.out.println("1 - да");
            System.out.println("0 - нет");
            response = scannerInt();
        }
    }

    public Client searchCreate() {
        System.out.println("Введите имя пользователя");
        String name = scannerStr();
        System.out.println("Введите год рождения ");
        int yearOfBirth = scannerInt();
        return new Client(name, yearOfBirth);
    }

    public int scannerInt() {
        int response = scanner.nextInt();
        scanner.nextLine();
        return response;
    }

    public String scannerStr() {
        return scanner.nextLine();
    }

}
