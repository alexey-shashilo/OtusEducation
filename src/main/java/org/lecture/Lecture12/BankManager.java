package org.lecture.Lecture12;

import java.util.List;
import java.util.Scanner;

public class BankManager implements BankManagement {
    private final Scanner scanner = new Scanner(System.in);
    private final ClientManager clientManager;
    private final Bank bank;

    BankManager(Bank bank) {
        this.bank = bank;
        clientManager = new ClientManager(bank);
    }

    public void menu() {
        Client client;
        int response = -1;
        while (response != 0) {
            System.out.println("Выберите пункт меню");
            System.out.println("1 - создать нового клиента");
            System.out.println("2 - вывести все счета клиента");
            System.out.println("3 - найти клиента по его счету");
            System.out.println("0 - выйти из банка");
            response = scannerInt();
            switch (response) {
                case 1:
                    clientManager.create();
                    break;

                case 2:
                    client = clientManager.searchCreate();
                    System.out.println(getAccounts(client));
                    break;

                case 3:
                    System.out.println("Введите номер счета");
                    Account account = new Account(scannerInt());
                    System.out.println(findClient(account));
                    break;
                case 0:
                    break;
            }
        }
    }


    @Override
    public Client findClient(Account account) {
        return bank.getClientMap().get(account);
    }

    @Override
    public List<Account> getAccounts(Client client) {
        return bank.getAccountMap().get(client);
    }

    private int scannerInt() {
        int response = scanner.nextInt();
        scanner.nextLine();
        return response;
    }
}
