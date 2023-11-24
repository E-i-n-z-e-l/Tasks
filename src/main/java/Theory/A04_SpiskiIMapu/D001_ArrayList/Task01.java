package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;

/**
 * Задача №1. Создайте ArrayList целых чисел и напишите программу, которая найдет сумму всех элементов в списке.
 */
public class Task01 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(1);
        intList.add(1);
        intList.add(1);
        intList.add(1);

        for (int x: intList) {
            System.out.println(x);
        }

        int sumArray = 0;
        for (int x : intList) {
            sumArray = x + sumArray;
        }
        System.out.println(sumArray);
    }
}
