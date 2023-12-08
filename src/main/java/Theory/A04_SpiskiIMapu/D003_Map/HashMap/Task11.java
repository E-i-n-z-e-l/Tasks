package Theory.A04_SpiskiIMapu.D003_Map.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Задание №11. Напишите программу, которая будет принимать на вход список слов и подсчитывать количество
 * анаграмм каждого слова в списке, используя HashMap. Затем выведите каждое слово и количество его анаграмм в списке.
 */
public class Task11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("автор");
        list.add("товар");
        list.add("дротик");
        list.add("диктор");
        list.add("слово");
        System.out.println(list);
        sortedWordinList(list);
        anagramSearch(list);
    }

    /**
     * Метод сортировки слова по алфавитному порядку.
     *
     * @param word
     * @return
     */
    public static String sortedWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    /**
     * Метод который сортирует слова в списке по алфавитному порядку и заменяет предыдущие слова списка.
     * @param list
     * @return
     */
    public static void sortedWordinList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String sortedWord = sortedWord(list.get(i));
            list.set(i, sortedWord);
        }
        System.out.println(list);
    }

    /**
     * Метод с помощью которого определяем анаграммы.
     * @param list
     */
    public static void anagramSearch(ArrayList<String> list) {
        HashMap<String, Integer> mapAnagramm = new HashMap<>(); // Создаем новый HashMap;
        for (String word : list) {
            if (mapAnagramm.containsKey(word)) {
                mapAnagramm.put(word, mapAnagramm.get(word) + 1);
            } else {
                mapAnagramm.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : mapAnagramm.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
