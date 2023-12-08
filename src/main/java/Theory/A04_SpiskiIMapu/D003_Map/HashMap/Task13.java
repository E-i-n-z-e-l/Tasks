package Theory.A04_SpiskiIMapu.D003_Map.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Задание №13. Напишите программу, которая будет принимать на вход список чисел и определять,
 * сколько пар чисел в списке имеют сумму, равную заданному значению, используя HashMap.
 */
public class Task13 {
    public static void main(String[] args) {
        giveListNumber(createList());
    }

    public static int[] createList() {
        int[] list = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.println("Введите число для занесения его в список: ");
            int number = scanner.nextInt();
            list[i] = number;
        }
        return list;
    }

    /**
     * Метод подсчета пар.
     * @param list
     */
    public static void giveListNumber(int[] list) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.length; i++) { // Проходимся по массиву чисел.
            for (int j = i + 1; j < list.length; j++) {
                int sum = list[i] + list[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
                /*
                Метод map.getOrDefault(key, defaultValue) в Java возвращает значение, связанное с указанным
                ключом key в HashMap. Если ключа key в карте нет, то возвращается значение defaultValue.

                Таким образом, этот метод позволяет безопасно увеличить значение, связанное с ключом sum на 1,
                не беспокоясь о том, существует ли уже пара с ключом sum в карте или нет. Если пары с ключом
                sum нет, то метод map.getOrDefault(sum, 0) вернет значение 0, к которому будет добавлено 1, и
                затем результат будет записан обратно в карту.
                 */
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
