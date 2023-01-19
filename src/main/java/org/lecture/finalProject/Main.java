package org.lecture.finalProject;

import org.lecture.finalProject.Servise.Currency;
import org.lecture.finalProject.Servise.CurrencyManagerConsole;
import org.lecture.finalProject.Servise.Number;

public class Main {
    public static void main(String[] args) {
        try {
            CurrencyManagerConsole currencyManagerConsole = new CurrencyManagerConsole();
            Currency currency = currencyManagerConsole.create("RUB");
            String[] string = new String[]{"ноль","один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
            currencyManagerConsole.addNumerals(currency,string);
            string = new String[]{"ноль","одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
            currencyManagerConsole.addNumerals(currency,string);
            string = new String[]{"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
            currencyManagerConsole.addNumerals(currency,string);
            string = new String[]{"одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
            currencyManagerConsole.addNumerals(currency,string);
            string = new String[]{ "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
            currencyManagerConsole.addNumerals(currency,string);

            string = new String[]{"копейка", "копейки", "копеек"};
            currencyManagerConsole.addCashUnits(currency,string);
            string = new String[]{"рубль", "рубля", "рублей"};
            currencyManagerConsole.addCashUnits(currency,string);
            string = new String[]{"тысяча", "тысячи", "тысяч"};
            currencyManagerConsole.addCashUnits(currency,string);
            string = new String[]{"миллион", "миллиона", "миллионов"};
            currencyManagerConsole.addCashUnits(currency,string);
            string = new String[]{"миллиард", "миллиарда", "миллиардов"};
            currencyManagerConsole.addCashUnits(currency,string);
            string = new String[]{"триллион", "триллиона", "триллионов"};
            currencyManagerConsole.addCashUnits(currency,string);

            Number number = new Number(0);
            System.out.println(number.getSegments());

//234_567_889_986_544.00
        } catch (Exception e) {
            System.out.println("There was some exception");
        }
    }
}
