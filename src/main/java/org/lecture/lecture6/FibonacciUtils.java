package org.lecture.lecture6;

public class FibonacciUtils {
    public static String getFibonacciSum(byte limit) {
        //Дано число. Реализуйте метод, который вычисляет числа
        // Фибоначчи (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...),
        // находит их сумму и возвращает её в виде строки.
        // Формула расчёта чисел: Fn = Fn-1 + Fn-2 - где n переданное
        // в метод число. Например для n=5 сумма будет равна 7,
        // а для n=2 сумма будет равна 1. Если в метод передано
        // отрицательное число - он должен вернуть 0.
        if (limit < 0) return "0";
        int sum = 1;
        int[] fibonacciArray = new int[limit];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i < limit; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            sum += fibonacciArray[i];
        }

        return sum + "";
    }

    private FibonacciUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Сумма чисел фибоначчи до 5 должна равняться 7 - " + FibonacciUtils.getFibonacciSum((byte) 5));
    }
}