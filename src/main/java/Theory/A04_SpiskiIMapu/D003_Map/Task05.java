package Theory.A04_SpiskiIMapu.D003_Map;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Задание №5. Напишите программу, которая принимает на вход массив целых чисел и подсчитывает количество
 * вхождений каждого числа в массиве, используя HashMap. Затем выведите каждое число и его количество
 * вхождений в массиве.
 */
public class Task05 {
    public static void main(String[] args) {
        int [] result = inputArray();
        countingNumbers(result);
    }

    /**
     * Создаем массив с помощью ввода в терминал.
     * @return
     */
    public static int[] inputArray() {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите целое число для записи его в массив: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    /**
     * Считаем количество каждого числа в массиве.
     * @param result
     * @return
     */
    public static HashMap<Integer, Integer> countingNumbers(int [] result) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Создаем новый HashMap;
        for (Integer i : result) { // Проходимся по массиву чисел который подается в метод;
            if (map.containsKey(i)) { // Если такой ключ уже есть в HashMap, то -
                map.put(i, map.get(i) + 1); // увеличиваем количество повторений этого числа увеличивая значение,
            } else {
                map.put(i, 1); // если такого ключа нет, то заночим его как новый ключ + значение.
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { // Выводим HashMap в терминал.
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        return map;
    }
}

