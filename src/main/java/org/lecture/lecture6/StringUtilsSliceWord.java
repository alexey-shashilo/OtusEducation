package org.lecture.lecture6;

public class StringUtilsSliceWord {
    //Дана строка, реализуйте метод, который позволяет получать подстроку по заданным индексам
    // Пример getSlice("Test", 1, 4) - вернёт "est"
    public static String getSlice(String input, int leftEdge, int rightEdge) {
        String result = "";
        for (int i = leftEdge; i < rightEdge; i++){
            result += input.charAt(i);
        }
        return result;
    }

    private StringUtilsSliceWord() {
    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"Test\" с индексами 1 и 4 метод должен вернуть \"est\" - "
                + "\"" + StringUtilsSliceWord.getSlice("Test", 1,4) +"\"");
    }
}