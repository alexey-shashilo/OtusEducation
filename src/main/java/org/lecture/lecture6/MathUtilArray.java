package org.lecture.lecture6;

public class MathUtilArray {
    //Дано число. Реализуйте метод, который принимает число
    // и возвращает в виде строки все чётные числа от 1 до переданного числа включительно.
    // Если передано отрицательное число метод должен вернуть пустую строку.
    // Если передан 0, то метод должен вернуть 1.
    // Пример вывода для числа 5: 1245

    public static String getEvenNumbersUpTo(byte number) {
        if (number < 0) {
            return "";
        } else if (number == 0) {
            return "1";
        }
        String result = "1";
        for (int i = 2; i < number; i += 2) {
            result += i;
        }
        result += number;
        return result;
    }

    private MathUtilArray() {

    }

    public static void main(String[] args) {
        System.out.println("Если передать число 5, то метод должен вернуть строку 1245 - " + MathUtilArray.getEvenNumbersUpTo((byte) 5));
    }
}