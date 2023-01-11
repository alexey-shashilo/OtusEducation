package org.lecture.lecture6;

public class ConditionalUtilsCountInner {
    //Реализуйте метод, который принимает два положительных числа - двузначное и четырехзначное -
    // и проверяет, сколько раз двузначное число встречается как «внутреннее» по отношению к четырехзначному.
    public static int countInnerNumber(int base, int checkNumber) {
        int num1 = base / 100;
        int num2 = base / 10 % 10;
        int num3 = base % 100;
        int count = 0;
        if (checkNumber == num1) count++;
        if (checkNumber == num2) count++;
        if (checkNumber == num3) count++;
        return count;
    }

    private ConditionalUtilsCountInner() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе чисел 6522 и 22 метод должен вернуть 1 - "
                + ConditionalUtilsCountInner.countInnerNumber(6522, 22));
    }
}