package org.lecture.lecture16.demo.demo04.tests.unit;

import org.lecture.lecture16.demo.demo04.app.service.FactorialCalculatorV03;
import org.lecture.lecture16.demo.assertions.Assertions;
import org.lecture.lecture16.demo.demo04.app.service.*;

public class FactorialCalculatorTest04 {

    // Состояние на момент написания теста
    private final FactorialCalculatorV03 factorialCalculator = new FactorialCalculatorV03();

    // После починки теста
    //private final FactorialCalculatorV04 factorialCalculator = new FactorialCalculatorV04();

    public void testFactorialCalculationForPositiveN() {
        String scenario = "V4. Тест расчета факториала положительного числа";
        try {
            int expected = 6;
            int actual = factorialCalculator.factorial(3);
            Assertions.assertEquals(expected, actual);

            expected = 720;
            actual = factorialCalculator.factorial(6);
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testFactorialCalculationForN0() {
        String scenario = "V4. Тест расчета факториала числа 0";
        try {
            int expected = 1;
            int actual = factorialCalculator.factorial(0);
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testFactorialCalculationForNegativeN() {
        String scenario = "V4. Тест расчета факториала отрицательного числа";
        try {
            Throwable actual = null;
            try {
                factorialCalculator.factorial(-10);
            } catch (Throwable e) {
                actual = e;
            }

            if (actual == null) {
                throw new AssertionError("Given code does not throw any exception");
            } else {
                Assertions.assertEquals(IllegalArgumentException.class, actual.getClass());
            }

            /*
            Assertions.assertThrows(IllegalArgumentException.class,
                    () -> factorialCalculator.factorial(-10));
             */

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

}
