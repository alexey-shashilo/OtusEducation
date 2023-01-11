package org.lecture.lecture6;

public class MathUtilAvg {
    //Даны 2 числа. Реализуйте метод, который вычисляет все чётные числа
    // между переданными числами и выводит из них среднее значение.
    // Если получается дробное значение метод должен округлить число
    // до целого в меньшую сторону. Если хотя бы одно число из переданных
    // является отрицательным метод должен вернуть 0.
    // Первое переданное число должно быть всегда меньше второго иначе метод должен вернуть 0.
    public static int getPrimeNumbersSum(byte lowEdge, byte highEdge) {
        if (lowEdge >= highEdge || lowEdge < 0) {
            return 0;
        }
        int sum = 0;
        int avg = 0;

        for (; lowEdge <= highEdge; lowEdge++) {
            if (lowEdge % 2 == 0) {
                sum += lowEdge;
                avg += 1;
            }
        }


        return sum / avg;
    }

    private MathUtilAvg() {

    }

    public static void main(String[] args) {
        System.out.println("avg четных чисел у ряда с 1 до 10 должен равняться 6 - "
                + MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 10));
        System.out.println("avg четных чисел у ряда с 1 до 10 должен равняться 6 - "
                + MathUtilAvg.getPrimeNumbersSum((byte) 10, (byte) 1));
        System.out.println("avg четных чисел у ряда с 1 до 10 должен равняться 6 - "
                + MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 1));
        System.out.println("avg четных чисел у ряда с 1 до 10 должен равняться 6 - "
                + MathUtilAvg.getPrimeNumbersSum((byte) -5, (byte) 10));
    }

}