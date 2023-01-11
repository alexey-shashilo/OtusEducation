package org.lecture.lecture6;

//Дана строка, состоящая из скобок, а также открывающий и закрывающий символ скобок.
//Необходимо реализовать метод, который проверяет что в строке у каждой открывающей
//скобки есть соответствующая ей закрывающая скобка. Строка в которой закрывающая
//скобка идёт впереди открывающей является некорректной.
//Например (()) - корректная строка, ()) - некорректная строка

public class BracketUtil {
    public static boolean isCorrectBrackets(String input, char bracketOpenSymbol, char bracketCloseSymbol) {
        String sumdol = String.valueOf(bracketOpenSymbol) + String.valueOf(bracketCloseSymbol);
        while (input.contains(sumdol)) {
            input = input.replace(sumdol, "");
        }
        if (input.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private BracketUtil() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}", '{', '}'));
        System.out.println("Ввод неравного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}}", '{', '}'));
    }
}