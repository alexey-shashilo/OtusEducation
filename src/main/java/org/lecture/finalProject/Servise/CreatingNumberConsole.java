package org.lecture.finalProject.Servise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CreatingNumberConsole implements CreatingNumber {
    @Override
    public Number create(String num1) {
        BigDecimal num = new BigDecimal(num1);
        List<Integer> segments = new ArrayList<>();

        BigInteger num_tmp = num.multiply(BigDecimal.valueOf(100)).toBigInteger();
        BigInteger cent = num_tmp.mod(BigInteger.valueOf(100));
        segments.add(cent.intValue());
        num_tmp = num_tmp.divide(BigInteger.valueOf(100));

        while (num_tmp.compareTo(BigInteger.valueOf(1000)) > 0) {
            cent = num_tmp.mod(BigInteger.valueOf(1000));
            segments.add(cent.intValue());
            num_tmp = num_tmp.divide(BigInteger.valueOf(1000));
        }
        segments.add(num_tmp.intValue());
        return new Number(segments);
    }
}
