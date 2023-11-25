package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;

/**
 * Задача №8. Создайте ArrayList целых чисел и напишите программу, которая найдет все пары чисел в списке,
 * сумма которых равна заданному числу.
 */
public class Task08 {
    public static int searchForPair(ArrayList<Integer> list, int number) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == number) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        int numberOne = 15;
        int numberTwo = 10;
        int numberTree = 18;

        int answerOne = searchForPair(list, numberOne);
        int answerTwo = searchForPair(list, numberTwo);
        int answerTree = searchForPair(list, numberTree);

        System.out.println(answerOne);
        System.out.println(answerTwo);
        System.out.println(answerTree);
    }
}
