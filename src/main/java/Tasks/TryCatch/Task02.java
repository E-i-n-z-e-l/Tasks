package Tasks.TryCatch;

import java.util.Scanner;

/**
 Напишите метод, который принимает на вход строку и пытается преобразовать ее в число.
 Если преобразование не удалось, метод должен вернуть значение -1.
 */
public class Task02 {
    public static int tryParse(String str) { // Создаем метод который принимает строку.
        try {
            return Integer.parseInt(str); // Переводим строку в число.
        } catch (NumberFormatException e) {
            return -1; // Возвращаем значение -1, если строка не является числом
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        int number = tryParse(str);

    }
}
