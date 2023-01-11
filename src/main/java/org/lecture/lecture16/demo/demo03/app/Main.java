package org.lecture.lecture16.demo.demo03.app;

import org.lecture.lecture16.demo.demo03.app.service.*;
import org.lecture.lecture16.demo.demo03.app.service.*;

public class Main {

    public static void main(String[] args) {
        IOService ioService = new IOStreamsService(System.out, System.in);
        FactorialCalculator factorialCalculator = new FactorialCalculatorImpl();
        FactorialApplication application = new FactorialApplication(ioService, factorialCalculator);
        application.run();
    }
}
