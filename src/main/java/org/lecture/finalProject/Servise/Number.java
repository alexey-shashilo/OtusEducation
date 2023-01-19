package org.lecture.finalProject.Servise;

import java.util.ArrayList;
import java.util.List;

public class Number {
    List<Integer> segments = new ArrayList<>();

    Number(double num) {
        int num_tmp = (int) (num % 1);
        segments.add(num_tmp);
        num_tmp = (int) num;
        while (num_tmp > 1000) {
            segments.add(num_tmp % 1000);
            num_tmp = num_tmp / 1000;
        }
    }
    public int size(){
        return segments.size();
    }
    public List<Integer> getSegments() {
        return segments;
    }
}
