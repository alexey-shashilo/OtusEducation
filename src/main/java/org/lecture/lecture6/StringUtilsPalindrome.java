package org.lecture.lecture6;

public class StringUtilsPalindrome {

    //Реализовать метод, который проверяет что переданная на вход строка является палиндромом
    // (то есть читается одинаково в обоих направлениях)
    // Примеры строк-палиндромов: шалаш; доход; заказ; Лёша на полке клопа нашёл
    // Все знаки препинания, цифры и специальные символы должны игнорироваться методом в вычислении палиндрома
    // Если переданная строка состоит только из спецсимволов, то метод должен вернуть false

    public static boolean isPalindrome(String input) {
        String inputClean = "";
        String inputCleanReverse = "";

        for (int i = 0; i < input.length(); i++){
            if (Character.isLetter(input.charAt(i))){
                inputClean += Character.toLowerCase(input.charAt(i));
            }
        }
        for (int i = inputClean.length()-1; i >= 0; i--){
            inputCleanReverse += inputClean.charAt(i);
        }
        return inputClean.equals(inputCleanReverse);
    }

    private StringUtilsPalindrome() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"шалаш\" метод должен вернуть true - " + StringUtilsPalindrome.isPalindrome("abccba"));
    }
}
