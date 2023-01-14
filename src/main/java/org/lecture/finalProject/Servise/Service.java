package org.lecture.finalProject.Servise;

public class Service {
    public String declensionOfANounAfterANumeral(double number, Noun noun) {
        double num10 = number % 100;
        double num1 = number % 10;
        if (num10 >= 10 && num10 <= 20) {
            return (number + " " + noun.word3());
        } else if (num1 == 1) {
            return (number + " " + noun.word1());
        } else if (num1 >= 2 && num1 <= 4) {
            return (number + " " + noun.word2());
        } else {
            return (number + " " + noun.word3());
        }
    }
}
