package Theory.A04_SpiskiIMapu.D003_Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Задание №3. Порядок доступа. Создайте LinkedHashMap и добавьте в него несколько элементов.
 * Затем обратитесь к некоторым элементам несколько раз. После этого выполните итерацию по
 * элементам и увидите, что порядок элементов изменился: элементы, к которым вы обращались чаще,
 * переместились в конец.
 */
public class Task03 {
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
        System.out.println(map.get(5));
        System.out.println(map.get(5));
        System.out.println(map.get(5));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsKey(5));
        System.out.println(map.get(5));
        System.out.println(map.get(5));
        System.out.println(map.get(5));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsKey(5));
        System.out.println("________________________________________________________________");
        seeMap(map);
    }
    public static void seeMap(LinkedHashMap<Integer, String> map) {
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
