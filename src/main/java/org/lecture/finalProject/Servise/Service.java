package org.lecture.finalProject.Servise;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public List<String> convertingANumberToAString(Number number, Currency currency) {
        List<String> result = new ArrayList<>();
        List<Integer> segments = number.getSegments();

        for (int i = segments.size() - 1; i >= 0; i--) {
            int segment = segments.get(i);
            StringBuilder subResult = new StringBuilder();
            if (segment == 0 && i != 0 && i != 1) {
                continue;
            } else if (segment == 0) {
                subResult.append(currency.getNumerals().get(0)[0]).append(" ");
            }

            while (segment != 0) {
                if (segment < 10) {
                    if (i == 0) {
                        subResult.append(currency.getNumerals().get(0)[segment]).append(" ");
                    } else {
                        subResult.append(currency.getNumerals().get(1)[segment]).append(" ");
                    }
                } else if (segment > 10 && segment < 20) {
                    subResult.append(currency.getNumerals().get(3)[segment % 10]).append(" ");
                    break;
                } else if (segment > 99) {
                    subResult.append(currency.getNumerals().get(4)[segment / 100]).append(" ");
                    segment %= 100;
                    continue;
                } else {
                    subResult.append(currency.getNumerals().get(2)[segment / 10]).append(" ");
                    segment %= 10;
                    continue;
                }
                segment /= 10;
            }

            segment = segments.get(i);
            subResult.append(declensionOfANounAfterANumeral(segment, currency, i));
            result.add(subResult.toString());
        }

        return result;
    }

    public String declensionOfANounAfterANumeral(int segment, Currency currency, int index) throws IndexOutOfBoundsException {
        double num10 = segment % 100;
        double num1 = segment % 10;
        if (num10 >= 10 && num10 <= 20) {
            return currency.getCashUnits().get(index)[2];
        } else if (num1 == 1) {
            return currency.getCashUnits().get(index)[0];
        } else if (num1 >= 2 && num1 <= 4) {
            return currency.getCashUnits().get(index)[1];
        } else {
            return currency.getCashUnits().get(index)[2];
        }
    }


}
