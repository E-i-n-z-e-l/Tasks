package Theory.Stream_API.Task01;


import java.util.Arrays;
import java.util.List;

/**
 * Напишите программу, которая использует Stream API для обработки списка чисел.
 * Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double averageHonest = numbers.stream()
                .filter(n -> n % 2 == 0)     // Выбираем только четные числа;
                .mapToInt(Integer::intValue) // Преобразуем каждое число в тип int для использования других методов;
                .average()                   // Находим среднее значение всех чисел;
                .orElse(0.0);          // В случае отсутствия элементов, мы используем метод orElse(),
                                             // чтобы установить значение по умолчанию;

        System.out.println(averageHonest);
    }
}
