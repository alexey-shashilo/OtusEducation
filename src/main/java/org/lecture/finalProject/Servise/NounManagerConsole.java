package org.lecture.finalProject.Servise;

import java.util.Scanner;

public class NounManagerConsole implements NounManager {
    Scanner scanner = new Scanner(System.in);
    Service service = new Service();

    @Override
    public Noun create() {
        String word1 = nextLine("Enter the declension of the word for the number 1");
        String word2 = nextLine("Enter the declension of the word for the number 2");
        String word3 = nextLine("Enter the declension of the word for the number 5");
        return new Noun(word1, word2, word3);
    }

    @Override
    public void withdraw(double number, Noun noun) {
        System.out.println(service.declensionOfANounAfterANumeral(number, noun));
    }

    private String nextLine(String string) {
        System.out.println(string);
        return scanner.nextLine();
    }
}
