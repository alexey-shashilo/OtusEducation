package org.lecture.lecture6;

//Дана строка, состоящая из слов, разделенных пробелами.
// Необходимо реализовать метод, который возвращает строку,
// слова в которой записаны в обратном порядке.
// Например, для строки "test abc" необходимо получить строку "abc test".
public class WordUtils {
    public static String reverseWords(String inputText) {
        String[] textArr = inputText.split(" ");
        String reverseTextArr = "";
        for (int i = textArr.length - 1; i >= 0; i--) {
            reverseTextArr += textArr[i];
            if (i != 0) {
                reverseTextArr += " ";
            }
        }

        return reverseTextArr;
    }

    private WordUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("Ввод одного слова - " + WordUtils.reverseWords("word"));
        System.out.println("Ввод двух слов - " + WordUtils.reverseWords("два слова"));
    }
}