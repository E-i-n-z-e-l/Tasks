package Tasks.TryCatch;

import java.util.Scanner;

/**
 * Напишите метод, который принимает на вход строку и переводит ее в число. Если перевод не удалось,
 * метод должен сообщить что введено не число.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        try {
            int number = Integer.parseInt(str);
            System.out.println("Введено число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
    }
}
