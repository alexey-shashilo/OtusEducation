package org.lecture.lecture6;

public class StringUtilsBiggestWord {

    //Дана строка, реализовать метод который ищет слово с наибольшим количеством букв.
    // Если таких слов несколько - вывести последнее

    public static String getLargest(String input) {
        int indexTheBiggestWord = 0;
        String[] inputArray = input.split(" ");
        for (int i = 1; i <inputArray.length;i++){
            if (inputArray[i].length() >= inputArray[i-1].length()){
                indexTheBiggestWord = i;
            }
        }
        return inputArray[indexTheBiggestWord];
    }

    private StringUtilsBiggestWord() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"самое большое слово\" метод должен вернуть \"большое\" - "
                + StringUtilsBiggestWord.getLargest("самое большое слово"));
    }
}