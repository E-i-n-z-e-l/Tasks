package Theory.A04_SpiskiIMapu.D003_Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * Задание №10. Создайте HashMap, в котором ключами будут названия книг, а значениями - их авторы. Добавьте несколько книг
 * и их авторов в HashMap, затем напишите программу, которая будет запрашивать у пользователя название книги и
 * выводить ее автора.
 */
public class Task10 {
    public static void main(String[] args) {
        HashMap<String, String> books = new HashMap<String, String>();
        books.put("Приют грез" , "Ремарк");
        books.put("Станция на горизонте" , "Ремарк");
        books.put("На Западном фронте без перемен" , "Ремарк");
        books.put("Возвращение" , "Ремарк");
        books.put("Три товарища" , "Ремарк");
        seeBooks(books);
        giveAuthor(books);
    }
    public static void seeBooks(HashMap<String, String> books) {
        for (Map.Entry<String, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void giveAuthor(HashMap<String, String> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи название книги: ");
        String input = scanner.nextLine();
        boolean fail = false;
        for (Map.Entry<String, String> entry : books.entrySet()) {
            String nameBook = entry.getKey();
            String nameAuthor = entry.getValue();
            if (Objects.equals(nameBook, input)) {
                System.out.println("Автор книги " + entry.getKey() + " " + entry.getValue());
                fail = true;
                break;
            }
        }
        if (!fail) {
            System.out.println("Такой книги нет в каталоге.");
        }
    }
}
