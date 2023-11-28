package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;

import java.util.Collections;


import static Theory.A04_SpiskiIMapu.D001_ArrayList.Task11.Solution.solutionOne;

/**
 * Задача №11. Создайте ArrayList целых чисел и напишите программу, которая найдет наибольшую разницу между
 * двумя соседними элементами в списке.
 */
public class Task11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(14);
        list.add(3);
        list.add(5);
        System.out.println(list);
        System.out.println(solutionTwo(list));
    }

    public static class Solution {
        public static int solutionOne(ArrayList<Integer> list) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= 0) {
                    System.out.println("В списке есть отрицательное число! Измените список!");
                } else {
                    for (int j = 0; j < list.size() - 1; j++) {
                        if (list.get(j) > list.get(j + 1)) {
                            int answer = list.get(j) - list.get(j + 1);
                            if (answer > count) {
                                count = answer;
                            }
                        } else {
                            int answer = list.get(j + 1) - list.get(j);
                            if (answer > count) {
                                count = answer;
                            }
                        }
                    }
                }
            }
            return count;
        }
    }
    public static int solutionTwo(ArrayList<Integer> list) {
        int maxDifference = 0;
        for (int i = 1; i < list.size(); i++) {
            int difference = Math.abs(list.get(i) - list.get(i - 1)); // Math.abs() возвращает число без минуса;
            if (difference > maxDifference) {
                maxDifference = difference;
            }
        }
        return maxDifference;
    }
}
