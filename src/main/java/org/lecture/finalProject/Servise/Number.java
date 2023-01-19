package org.lecture.finalProject.Servise;

import java.util.ArrayList;
import java.util.List;

public class Number {
    List<Integer> segments = new ArrayList<>();
    List<String> numberInText;

    public Number(double num) {
        int num_tmp = (int) (num * 100);
        segments.add(num_tmp % 100);
        num_tmp = (int) num;
        while (num_tmp > 1000) {
            segments.add(num_tmp % 1000);
            num_tmp = num_tmp / 1000;
        }
        segments.add(num_tmp);
    }

    public List<Integer> getSegments() {
        return segments;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String number : numberInText) {
            result.append(number).append(" ");
        }
        return result.toString();
    }

    public void setNumberInText(List<String> numberInText) {
        this.numberInText = numberInText;
    }
}
