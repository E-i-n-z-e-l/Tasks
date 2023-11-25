package Theory.A04_SpiskiIMapu.D001_ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Задача №5. Создайте два ArrayList целых чисел и напишите программу, которая объединит их в один список,
 * удалив при этом все дубликаты.
 */
public class Task05 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(7);

        list1.addAll(list2);
        Collections.sort(list1);


        for (int x: list1) {
            System.out.println(x);
        }

        // Самый эфективный способ через HashSet (убирает все дубликаты из списка).
        HashSet<Integer> set = new HashSet<>(list1);
        System.out.println(set);

        // Делаем через вложенный цикл.
        for (int i = 0; i < list1.size(); i++) {
            for (int j = i + 1; j < list1.size(); j++) { // j = i + 1 потому что нужно проверять каждое следующее
                                                        // число в списке с первым в списке.
                if (list1.get(i).equals(list1.get(j))) { // Метод equals() сравнивает между собой значения.
                    list1.remove(j); // Удаление дубликата.
                    j--; // Смещаемся влево чтобы не пропустить все числа в списке. Так как при использовании
                        // метода remove() - удаление из списка, часть значений из списка может сместиться влево.
                }
            }
        }
        System.out.println(list1);
    }
}
