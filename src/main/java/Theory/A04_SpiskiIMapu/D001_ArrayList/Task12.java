package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;
import java.util.Objects;

import static Theory.A04_SpiskiIMapu.D001_ArrayList.Task12.Solution.solution;

/**
 * Задание №12. Создайте ArrayList целых чисел и напишите программу, которая найдет все уникальные тройки
 * чисел в списке, сумма которых равна заданному числу.
 */
public class Task12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(8);
        System.out.println(list);

        int numberOne = 12;
        int numberTwo = 16;
        int numberTree = 27;
        solution(list, numberTwo);
    }

    public static class Solution {
        public static void solution(ArrayList<Integer> list, int number) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    for (int k = j + 1; k < list.size(); k++) {
                        if (list.get(i) + list.get(j) + list.get(k) == number && !Objects.equals(list.get(i), list.get(j)) && !Objects.equals(list.get(i), list.get(k)) && !Objects.equals(list.get(j), list.get(k))) {
                            System.out.println("| " + list.get(i) + " | " + list.get(j) + " | " + list.get(k) + " | ");
                        }
                    }
                }
            }
        }
    }
}
