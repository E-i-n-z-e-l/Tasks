package Theory.A04_SpiskiIMapu.D002_LinkedList;

import java.util.LinkedList;

/**
 * Задача 5: Объединение двух списков.<p>
 * Напишите метод, который принимает два связанных списка и объединяет их в один, сохранив порядок элементов.
 */
public class Task05 {
    public static LinkedList<String> solution(LinkedList<String> listOne, LinkedList<String> listTwo) {
        LinkedList<String> listTree = new LinkedList<>();
        for (String string : listOne) {
            listTree.addLast(string);
        }
        for (String s : listTwo) {
            listTree.addLast(s);
        }
        return listTree;
    }

    public static void main(String[] args) {
        LinkedList<String> listOne = new LinkedList<>();
        LinkedList<String> listTwo = new LinkedList<>();
        listOne.add("1");
        listOne.add("2");
        listOne.add("3");
        listOne.add("4");
        listTwo.add("5");
        listTwo.add("6");
        listTwo.add("7");
        listTwo.add("8");
        System.out.println(listOne);
        System.out.println(listTwo);
        System.out.println(solution(listOne, listTwo));
    }
}
