package Theory.A04_SpiskiIMapu.D003_Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Задание №1. Порядок вставки
 * Создайте LinkedHashMap, в который добавьте несколько элементов в порядке их добавления.
 * После этого выполните итерацию по элементам и убедитесь, что элементы идут в том же порядке,
 * в котором они были добавлены.
 */
public class Task01 {
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
    }
    public static void seeMap(LinkedHashMap<Integer, String> map) {
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
