package org.lecture.finalProject.Servise;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public List<String> convertingANumberToAString(Number number, Currency currency) {
        List<String> result = new ArrayList<>();
        List<Integer> segments = number.getSegments();

        for (int i = segments.size(); i >= 0; i--) {
            String segment = segments.get(i).toString();

        }
        return result;
    }

}
