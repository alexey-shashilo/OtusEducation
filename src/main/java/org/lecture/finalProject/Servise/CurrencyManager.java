package org.lecture.finalProject.Servise;

public interface CurrencyManager {
    void addCashUnits(Currency currency, String[] cashUnit);

    void addNumerals(Currency currency, String[] numeral);

    Currency create(String rub);
}
