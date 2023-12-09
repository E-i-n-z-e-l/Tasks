package Theory.A04_SpiskiIMapu.D003_Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Задание №2. Удаление элементов. Создайте LinkedHashMap и добавьте в него несколько элементов.
 * Попробуйте удалить элементы, а затем добавить их обратно. Посмотрите, как это влияет на порядок элементов в карте.
 */
public class Task02 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");
        map.put(7, "g");
        map.put(8, "h");
        seeMap(map);
        System.out.println("________________________________________________________________");
        map.remove(1);
        map.remove(2);
        map.remove(3);
        seeMap(map);
        System.out.println("________________________________________________________________");
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        seeMap(map);
    }
    public static void seeMap(LinkedHashMap<Integer, String> map) {
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
