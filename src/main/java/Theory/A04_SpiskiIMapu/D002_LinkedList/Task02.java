package Theory.A04_SpiskiIMapu.D002_LinkedList;


import java.util.LinkedList;
/**
 * Задача 2. Удаление дубликатов.<p>
 * Напишите метод, который удаляет все дубликаты элементов из списка.
 */
public class Task02 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        System.out.println(list);
        solution(list);
        System.out.println(list);
    }

    public static void solution(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (current == list.get(j)) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}
