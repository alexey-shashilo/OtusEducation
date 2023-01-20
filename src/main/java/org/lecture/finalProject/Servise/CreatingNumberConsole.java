package org.lecture.finalProject.Servise;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CreatingNumberConsole implements CreatingNumber {
    @Override
    public Number create(String num1) {
        BigDecimal num = new BigDecimal(num1);
        List<Integer> segments = new ArrayList<>();

        long num_tmp = num.multiply(BigDecimal.valueOf(100)).longValue();
        segments.add((int) (num_tmp % 100));
        num_tmp = num.longValue();
        while (num_tmp > 1000) {
            segments.add((int) (num_tmp % 1000));
            num_tmp = num_tmp / 1000;
        }
        segments.add((int) num_tmp);
        return new Number(segments);
    }
}
