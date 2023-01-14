package org.lecture.finalProject.tests;

import org.lecture.finalProject.Servise.Noun;
import org.lecture.finalProject.Servise.Service;

public class TestsService {
    Service service = new Service();

    public void ifYouTransferOneRubleYouShouldReturn1Ruble() {
        Noun noun = new Noun("рубль", "рубля", "рублей");
        int number = 1;
        String result = service.declensionOfANounAfterANumeral(number, noun);
        if (result.equals("1.0 рубль")) {
            System.out.println("OK");
        } else {
            System.err.println("Failed test 1");
        }
    }

    public void ifYouTransferOneRubleYouShouldReturn2Ruble() {
        Noun noun = new Noun("рубль", "рубля", "рублей");
        int number = 2;
        String result = service.declensionOfANounAfterANumeral(number, noun);
        if (result.equals("2.0 рубля")) {
            System.out.println("OK");
        } else {
            System.err.println("Failed test 2");
        }
    }

    public void ifYouTransferOneRubleYouShouldReturn5Rubles() {
        Noun noun = new Noun("рубль", "рубля", "рублей");
        int number = 5;
        String result = service.declensionOfANounAfterANumeral(number, noun);
        if (result.equals("5.0 рублей")) {
            System.out.println("OK");
        } else {
            System.err.println("Failed test 3");
        }
    }

    public static void main(String[] args) {
        TestsService testsService = new TestsService();
        testsService.ifYouTransferOneRubleYouShouldReturn1Ruble();
        testsService.ifYouTransferOneRubleYouShouldReturn2Ruble();
        testsService.ifYouTransferOneRubleYouShouldReturn5Rubles();
    }

}
