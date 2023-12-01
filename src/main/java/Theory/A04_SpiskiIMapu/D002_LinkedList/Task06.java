package Theory.A04_SpiskiIMapu.D002_LinkedList;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Задача 6. Поиск k-го элемента с конца.<p>
 * Напишите метод для поиска k-го элемента с конца связанного списка.
 */
public class Task06 {
    public static void solutionOne(LinkedList<String> list, String k) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (Objects.equals(list.get(i), k)) {
                System.out.println("Элемент |" + k + "| имеется в списке.");
            }
        }
    }

    public static String solutionTwo(LinkedList<String> list, int k) {
        int size = list.size();
        if (k > 0 && k <= size) {
            return list.get(size - k);
        } else {
            return "Некорректное значение k";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите искомый элемент: ");
//        String k = scanner.next();
        System.out.println("Введите id: ");
        int l = scanner.nextInt();

        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        System.out.println(list);
//        solutionOne(list, k);
        solutionTwo(list, l);
    }
}
