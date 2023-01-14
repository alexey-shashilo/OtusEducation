package org.lecture.finalProject;

import org.lecture.Test;
import org.lecture.finalProject.Servise.Noun;
import org.lecture.finalProject.Servise.NounManager;
import org.lecture.finalProject.Servise.NounManagerConsole;
import org.lecture.finalProject.tests.TestsService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            NounManager nounManager = new NounManagerConsole();
            Noun noun = nounManager.create();
            System.out.println("Insert the number");
            double number = scanner.nextDouble();
            nounManager.withdraw(number, noun);

            TestsService testsService = new TestsService();
            testsService.ifYouTransferOneRubleYouShouldReturn1Ruble();
            testsService.ifYouTransferOneRubleYouShouldReturn2Ruble();
            testsService.ifYouTransferOneRubleYouShouldReturn5Rubles();

        } catch (Exception e) {
            System.out.println("There was some exception");
        }
    }
}
