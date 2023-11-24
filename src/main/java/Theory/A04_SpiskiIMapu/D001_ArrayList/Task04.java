package Theory.A04_SpiskiIMapu.D001_ArrayList;
import java.util.ArrayList;
/**
 * Задача №4. Создайте ArrayList чисел и напишите программу, которая удалит все четные числа из списка.
 */
public class Task04 {
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
        list.add(10);

        for (int x: list) { // Печатаем список.
            System.out.println(x);
        }

        list.removeIf(x -> x % 2 == 0); // С помощью лямбда-функции удаляем все значения из списка кратные 2.
                                        // x -> определяем x. X определяется как Integer из-за того что наш список это
                                        // список Integer-ов.
        for (int x: list) {
            System.out.println(x);
        }
    }
}
