package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;

import static Theory.A04_SpiskiIMapu.D001_ArrayList.Task16.Solution.solution;

/**
 * Задача № 16. Создайте ArrayList целых чисел и напишите программу, которая найдет все непрерывные подсписки
 * с максимальной суммой элементов.
 * <p>
 * Алгоритм Кадана. Движемся по массиву слева направо и накапливаем в переменной temporary текущую частичную сумму.
 * Если в какой-то момент temporary окажется отрицательной, то присвоим temporary = 0. Максимум из всех значений
 * переменной temporary за время прохода по массиву и будет ответом на задачу.
 */
public class Task16 {
    public class Solution {
        public static int solution(ArrayList<Integer> list) {
            int sum = 0;
            int temporary = 0;
            for (int i = 0; i < list.size() - 1; i++) { // Проходимся по массиву
                temporary = temporary + list.get(i); // Прибавляем к подмассиву temporary значения из массива по очереди
                if (temporary > sum) {
                    sum = temporary;
                }
                if (temporary < 0) {
                    temporary = 0;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(-2);
        list.add(3);  // 3
        list.add(-1); // 2
        list.add(1);  // 3
        list.add(0);  // 3
        list.add(2);  // 5
        list.add(-1); // 4
        list.add(5);  // 9
        list.add(-6);
        list.add(2);
        list.add(1);
        System.out.println(list);
        System.out.println(solution(list));
    }
}
