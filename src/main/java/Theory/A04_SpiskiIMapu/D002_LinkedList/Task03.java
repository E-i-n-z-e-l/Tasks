package Theory.A04_SpiskiIMapu.D002_LinkedList;

import java.util.LinkedList;

/**
 * Задача 3. Напишите метод для переворачивания (инвертирования) связанного списка.<p>
 */
public class Task03 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        System.out.println(list);
        solution(list);
        System.out.println(list);
        solution2(list);
        System.out.println(list);
    }

    /**
     * Мое решение<p>
     * Замечания преподавателя:<p>
     * Вместо использования отдельной переменной result вы можете использовать временную переменную для обмена значений.
     * @param list
     */
    public static void solution(LinkedList<String> list) {
        String result;
        int count = 1;
        for (int i = 0; i < list.size() / 2; i++) {
            result = list.get(i);
            list.set(i, list.get(list.size() - count));
            list.set(list.size() - count, result);
            count++;
        }
    }

    /**
     * Решение преподавателя.
     * @param list
     */
    public static void solution2(LinkedList<String> list) {
        int size = list.size(); // Создаем переменную размером с размер массива.
        for (int i = 0; i < size / 2; i++) { // Проходимся по списку уменьшенному в два раза.
            String temp = list.get(i); // Создаем переменную и кладем в неё первое значения из списка.
            list.set(i, list.get(size - i - 1)); // Меняем местами последнее и первое значения в списке.
            list.set(size - i - 1, temp);
        }
    }
}
