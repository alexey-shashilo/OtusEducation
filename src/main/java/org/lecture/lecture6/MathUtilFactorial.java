package org.lecture.lecture6;

public class MathUtilFactorial {
    public static long getFactorial(byte number) {
        // Дано число. Реализовать метод для расчёта факториала числа.
        // Факториал натурального числа n определяется как произведение
        // всех натуральных чисел от 1 до n включительно.
        // Пример: 5! = 1 * 2 * 3 * 4 * 5
        // Факториал от числа 0 всегда равняется 1: 0! = 1
        // Если передано отрицательно число - метод должен вернуть 0
        // Если получаемое в результате число не помещается в памяти метод должен вернуть 0
        if (number < 0) {
            return 0;
        } else if (number == 0) {
            return 1;
        }
        int sumlFactorial = 1;
        for (int i = 1; i <= number;i++){
            sumlFactorial *= i;
        }
        return sumlFactorial;
    }

    private MathUtilFactorial() {

    }

    public static void main(String[] args) {
        System.out.println("Факториал от 5 должен равняться 120 - " + MathUtilFactorial.getFactorial((byte) 5));
    }
}