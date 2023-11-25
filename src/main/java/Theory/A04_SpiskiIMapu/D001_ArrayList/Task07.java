package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Задача №7. Создайте ArrayList строк и напишите программу, которая удалит все повторяющиеся слова из списка,
 * оставив только уникальные.
 */
public class Task07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Яблоко");
        list.add("Апельсин");
        list.add("Лимон");
        list.add("Дыня");
        list.add("Арбуз");
        list.add("Лимон");
        list.add("Дыня");
        list.add("Арбуз");
        list.add("Яблоко");
        list.add("Апельсин");
        System.out.println(list);

        // Через HashSet - множество удаляет повторяющиеся элементы.
        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);

        // Делаем через вложенный цикл
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                        j--;
                }
            }
        }
        System.out.println(list);
    }
}
