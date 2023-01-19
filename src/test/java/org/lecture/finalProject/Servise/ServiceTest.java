package org.lecture.finalProject.Servise;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceTest {

    @org.junit.jupiter.api.Test
    void convertingANumberToAString() {
        Service service = new Service();
        CurrencyManagerConsole currencyManagerConsole = new CurrencyManagerConsole();
        Currency currency = currencyManagerConsole.create("RUB");
        String[] string = new String[]{"ноль", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        currencyManagerConsole.addNumerals(currency, string);
        string = new String[]{"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        currencyManagerConsole.addNumerals(currency, string);
        string = new String[]{"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        currencyManagerConsole.addNumerals(currency, string);
        string = new String[]{"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        currencyManagerConsole.addNumerals(currency, string);
        string = new String[]{"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        currencyManagerConsole.addNumerals(currency, string);

        string = new String[]{"копейка", "копейки", "копеек"};
        currencyManagerConsole.addCashUnits(currency, string);
        string = new String[]{"рубль", "рубля", "рублей"};
        currencyManagerConsole.addCashUnits(currency, string);
        string = new String[]{"тысяча", "тысячи", "тысяч"};
        currencyManagerConsole.addCashUnits(currency, string);
        string = new String[]{"миллион", "миллиона", "миллионов"};
        currencyManagerConsole.addCashUnits(currency, string);
        string = new String[]{"миллиард", "миллиарда", "миллиардов"};
        currencyManagerConsole.addCashUnits(currency, string);
        string = new String[]{"триллион", "триллиона", "триллионов"};
        currencyManagerConsole.addCashUnits(currency, string);

        CreatingNumber creatingNumber = new CreatingNumberConsole();
        Number number = creatingNumber.create(new BigDecimal("191278.19"));
        number.setNumberInText(service.convertingANumberToAString(number, currency));
        String resultMethod = number.toString();
        String expectedResult = "сто девяносто одна тысяча двести семьдесят восемь рублей девятнадцать копеек";
        assertEquals(resultMethod, expectedResult);
    }
}