package Theory.A04_SpiskiIMapu.D003_Map.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача №2. Напишите программу, которая будет принимать на вход строку и подсчитывать количество каждого символа в ней,
 * используя HashMap для хранения символов и их количества.
 */
public class Task02 {
    public static void main(String[] args) {
        String inputString = "программирование";
        countingLetters(inputString);
    }
    public static Map<Character, Integer> countingLetters (String word) {
        char[] charArray = word.toCharArray(); // Переводим строку в массив символов;
        Map<Character, Integer> charCountMap = new HashMap<>(); // Создаем новый HashMap;
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) { // Проверяем на наличие такого ключа в HashMap.
                charCountMap.put(c, charCountMap.get(c) + 1); // если символ уже присутствует в HashMap charCountMap
                                                             // как ключ, то увеличивается значение этого ключа на 1
            } else {
                charCountMap.put(c, 1); // Если символ еще не присутствует в HashMap charCountMap, то он добавляется
                                       // как новый ключ со значением 1
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {  // Цикл для вывода информации в терминал;
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        return charCountMap;
    }
}