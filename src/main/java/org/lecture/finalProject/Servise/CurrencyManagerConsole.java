package org.lecture.finalProject.Servise;

import java.util.List;
import java.util.Scanner;

public class CurrencyManagerConsole implements CurrencyManager {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addCashUnits(Currency currency, String[] cashUnit) {
        List<String[]> cashUnits = currency.getCashUnits();
        cashUnits.add(cashUnit);
        currency.setCashUnits(cashUnits);
    }

    @Override
    public void addNumerals(Currency currency, String[] numeral) {
        List<String[]> numerals = currency.getNumerals();
        numerals.add(numeral);
        currency.setNumerals(numerals);
    }


    public Currency create() {
        return new Currency(nextLine("Enter currency code"));
    }
    @Override
    public Currency create(String rub) {
        return new Currency(rub);
    }

    private String nextLine(String string) {
        System.out.println(string);
        return scanner.nextLine();
    }
}
