package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Задача №10. Создайте ArrayList строк и напишите программу, которая отсортирует строки в списке в алфавитном порядке.
 */
public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Tree");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
