package Theory.A04_SpiskiIMapu.D004_StringBuilder;

import java.util.Arrays;

/**
 * Задание №7. Напиши метод, который принимает StringBuilder и возвращает true, если это палиндром, и false, если нет.
 */
public class Task07 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("aaabbbccc");
        StringBuilder sb2 = new StringBuilder("cccbbbaaa");
        palindrome(sb1, sb2);
    }
    public static void palindrome(StringBuilder sb1, StringBuilder sb2) {
        String sortedString1 = sb1.toString(); // Переводим StringBuilder в строку;
        String sortedString2 = sb2.toString();
        sortedString1 = sortString(sortedString1); // Сортируем буквы в строке по алфавиту;
        sortedString2 = sortString(sortedString2);
        sb1 = new StringBuilder(sortedString1); // Снова собираем в StringBuilder;
        sb2 = new StringBuilder(sortedString2);
        System.out.println(sb1.compareTo(sb2) == 0);

    }

    /**
     * Метод сортировки символов в строке.
     * @param inputString
     * @return
     */
    public static String sortString(String inputString) {
        char[] charArray = inputString.toCharArray(); // Переводим строку в массив символов;
        Arrays.sort(charArray); // Сортируем эти символы-буквы по алфавиту;
        return new String(charArray); // Снова собираем их в строку.
    }
}
