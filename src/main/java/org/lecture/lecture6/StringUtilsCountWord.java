package org.lecture.lecture6;

public class StringUtilsCountWord {
    //Реализуйте метод, который считает количество упоминаний указанного слова в строке
    // Пример countWord(""Test string for test"", test) должен вернуть 2
    public static int countWord(String input, String word) {
        int countWordInInput = 0;
        String[] inputArray = input.toLowerCase().split(" ");
        String subWord = word.toLowerCase();
        for (String s : inputArray) {
            if (s.equals(subWord)) {
                countWordInInput++;
            }
        }
        return countWordInInput;
    }

    private StringUtilsCountWord() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"Test string for test\" и искомом слове \"test\" метод должен вернуть 2 - "
                + StringUtilsCountWord.countWord("Test string for test", "test"));
    }
}