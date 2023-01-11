package org.lecture.lecture6;

import com.sun.jdi.Value;

public class StringUtilsCamel {
    //Дана строка. Реализуйте метод который бы приводил полученную строку к camel case нотации.
    // Если встречаются знаки препинания, иные специальные символы или цифры - они должны быть удалены.
    // Пример: входная строка - my camel * case string 1, результат - myCamelCaseString
    public static String toCamelCase(String input) {
        String result = "";
        String[] inputArray = input.split(" ");

        for (int i = 0; i < inputArray.length; i++) {
            char[] subInput = inputArray[i].toCharArray();

            for (int j = 0; j < subInput.length; j++) {
                if (Character.isLetter(subInput[j])) {
                    if (j == 0) {
                        if (result.length() == 0) {
                            result += subInput[j];
                        } else {
                            result += Character.toUpperCase(subInput[j]);
                        }
                    } else {
                        result += subInput[j];
                    }
                }
            }
        }
        return result;
    }

    private StringUtilsCamel() {

    }

    public static void main(String[] args) {
        System.out.println("Строка \"my camel * case string 1\" должна преобразоваться в myCamelCaseString - "
                + StringUtilsCamel.toCamelCase("my camel * case string 1"));
    }
}