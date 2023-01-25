package org.lecture.finalProject;

import org.lecture.finalProject.Servise.*;
import org.lecture.finalProject.Servise.Number;

public class Main {
    public static void main(String[] args) {
        try {
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
            string = new String[]{"квадриллион", "квадриллиона", "квадриллионов"};
            currencyManagerConsole.addCashUnits(currency, string);
            string = new String[]{"квинтиллион", "квинтиллиона", "квинтиллионов"};
            currencyManagerConsole.addCashUnits(currency, string);
            string = new String[]{"секстиллион", "секстиллиона", "секстиллионов"};
            currencyManagerConsole.addCashUnits(currency, string);

            CreatingNumber creatingNumber = new CreatingNumberConsole();
            Number number = creatingNumber.create("9223372036854775809111");
            number.setNumberInText(service.convertingANumberToAString(number, currency));
            System.out.println(number);

        } catch (IndexOutOfBoundsException e){
            System.err.println("The transferred number is larger than expected, it is necessary to expand the dictionary of number division units");
        }catch (Exception e) {
            System.err.println("There was some exception");
        }
    }
}
