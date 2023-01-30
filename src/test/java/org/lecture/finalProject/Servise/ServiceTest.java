package org.lecture.finalProject.Servise;

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

        Number number = creatingNumber.create("0");
        number.setNumberInText(service.convertingANumberToAString(number, currency));
        String Expected = number.toString();
        String Actual = "ноль рублей ноль копеек";
        assertEquals(Expected, Actual);

        number = creatingNumber.create("191278.19");
        number.setNumberInText(service.convertingANumberToAString(number, currency));
        Expected = number.toString();
        Actual = "сто девяносто одна тысяча двести семьдесят восемь рублей девятнадцать копеек";
        assertEquals(Expected, Actual);

        number = creatingNumber.create("100000000000.00");
        number.setNumberInText(service.convertingANumberToAString(number, currency));
        Expected = number.toString();
        Actual = "сто миллиардов рублей ноль копеек";
        assertEquals(Expected, Actual);

        number = creatingNumber.create("421583.70");
        number.setNumberInText(service.convertingANumberToAString(number, currency));
        Expected = number.toString();
        Actual = "четыреста двадцать одна тысяча пятьсот восемьдесят три рубля семьдесят копеек";
        assertEquals(Expected, Actual);

        number = creatingNumber.create("560834005.07");
        number.setNumberInText(service.convertingANumberToAString(number, currency));
        Expected = number.toString();
        Actual = "пятьсот шестьдесят миллионов восемьсот тридцать четыре тысячи пять рублей семь копеек";
        assertEquals(Expected, Actual);

        number = creatingNumber.create("0.01");
        number.setNumberInText(service.convertingANumberToAString(number, currency));
        Expected = number.toString();
        Actual = "ноль рублей одна копейка";
        assertEquals(Expected, Actual);

        number = creatingNumber.create("0000000000.00");
        number.setNumberInText(service.convertingANumberToAString(number, currency));
        Expected = number.toString();
        Actual = "ноль рублей ноль копеек";
        assertEquals(Expected, Actual);
    }
}