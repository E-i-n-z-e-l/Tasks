package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import static Theory.A04_SpiskiIMapu.D001_ArrayList.Task14.Solution.solutionOne;



/**
 * Задание №14. Создайте ArrayList строк и напишите программу, которая найдет все анаграммы в списке
 * (слова, образованные перестановкой букв другого слова)
 */
public class Task14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Удар");
        list.add("Лаос");
        list.add("Каре");
        list.add("Сало");
        list.add("Река");
        list.add("Руда");
        System.out.println(list);
        int sol = solutionOne(list);
        System.out.println("В списке " + sol + " анаграммы");
    }

    public class Solution {
        public static int solutionOne(ArrayList<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i).toLowerCase(); // Получаем строку из списка
                char[] chars = s.toCharArray(); // Преобразование строки в массив символов
                Arrays.sort(chars); // Сортировка массива символов
                String sortedWord = new String(chars); // Преобразование массива обратно в строку
                list.set(i, sortedWord); // Заменяем исходную строку на отсортированную
            }
            int count = 0;
            for (int k = 0; k < list.size(); k++) {
                for (int j = k + 1; j < list.size(); j++) {
                    if (list.get(k).equals(list.get(j))) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
/*
                                    Комментарий от преподавателя

Ваше решение через сортировку также находит анаграммы в списке, но оно менее эффективно, чем решение
с использованием HashMap. Ваш подход требует двух циклов для сравнения отсортированных слов, что делает
его менее оптимальным с точки зрения производительности. Решение с использованием HashMap выполняет сортировку
и сравнение слов только один раз, что делает его более эффективным. Таким образом, ваше решение дает правильный
результат, но более эффективное решение можно получить с использованием HashMap.
 */