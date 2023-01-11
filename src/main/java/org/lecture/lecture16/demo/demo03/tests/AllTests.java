package org.lecture.lecture16.demo.demo03.tests;

import org.lecture.lecture16.demo.demo03.tests.unit.FactorialApplicationTest;
import org.lecture.lecture16.demo.demo03.tests.unit.FactorialCalculatorTest;
import org.lecture.lecture16.demo.demo03.tests.unit.IOStreamsServiceTest;

public class AllTests {
    public static void main(String[] args) {
        new FactorialCalculatorTest().testFactorialCalculationWithPositiveN();

        new IOStreamsServiceTest().testInput();
        new IOStreamsServiceTest().testOutput();
        new IOStreamsServiceTest().testFormattedOutput();

        new FactorialApplicationTest().testAppFlow();
    }
}
