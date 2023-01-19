package org.lecture.finalProject.Servise;

import java.util.ArrayList;
import java.util.List;

public class Number {
    List<Integer> segments = new ArrayList<>();
    List<String> numberInText;

    public Number(List segments) {
        this.segments = segments;
    }

    public List<Integer> getSegments() {
        return segments;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int size = numberInText.size();
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                result.append(numberInText.get(i));
            } else {
                result.append(numberInText.get(i)).append(" ");
            }

        }
        return result.toString();
    }

    public void setNumberInText(List<String> numberInText) {
        this.numberInText = numberInText;
    }
}
