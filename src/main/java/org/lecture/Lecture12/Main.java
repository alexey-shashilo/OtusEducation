package org.lecture.Lecture12;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankManager bankManager = new BankManager(bank);
        bankManager.menu();
    }
}
