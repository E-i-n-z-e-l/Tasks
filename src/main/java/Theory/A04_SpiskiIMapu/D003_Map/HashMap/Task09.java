package Theory.A04_SpiskiIMapu.D003_Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Задание №9. Напишите программу, которая будет принимать на вход строку и подсчитывать количество каждой буквы
 * в строке, используя HashMap. Затем выведите каждую букву и ее количество в строке.
 */
public class Task09 {
    public static void main(String[] args) {
        String word = "мегабольшоесловодаюявам";
        giveMeLetter(word);
    }
    public static void giveMeLetter(String word) {
        char[] charArray = word.toCharArray(); // Переводим строку в массив символов;
        Map<Character, Integer> charCountMap = new HashMap<>(); // Создаем новый HashMap;
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
