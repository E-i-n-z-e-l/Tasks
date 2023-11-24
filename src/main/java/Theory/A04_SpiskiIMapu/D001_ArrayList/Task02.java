package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;

/**
 * Задача №2. Создайте ArrayList строк и напишите программу, которая найдет самое длинное слово в списке.
 */
public class Task02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("111");
        list.add("111111");
        list.add("111");
        list.add("1111");
        list.add("22222222");

        for (String s : list) { // Для наглядности печатаем список.
            System.out.println("Строка " + s);
        }

        String maxLength = ""; // Создаем переменную с длиной строки 0 чтобы сравнивать с остальными строками в списке.
        for (String s : list) {
            if (maxLength.length() < s.length()) { // s - это каждая строка в списке которую мы сравниваем с maxLength.
                maxLength = s;
            }
        }
        System.out.println(maxLength);
    }
}
