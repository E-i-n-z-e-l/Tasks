package Theory.A04_SpiskiIMapu.D002_LinkedList;

import java.util.LinkedList;



/**
 * Задача 1. Добавление элементов в связанный список.
 * Напишите метод, который принимает LinkedList и элемент, и добавляет этот элемент в конец списка.
 */
public class Task01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        String name = "Aleksey";
        list.add("Beks");
        list.add("Leks");
        list.add("Keks");
        list.add("Zeks");
        System.out.println(list);
        solution(list, name);
        System.out.println(list);

    }
    public static void solution(LinkedList<String> list, String name) {
        list.addLast(name);
    }
}
