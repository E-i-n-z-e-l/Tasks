package Theory.A01_Basics;

import java.util.Scanner;

/**
 Сравниваем строки. Пример с вводом пароля.
 */
public class A016_StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        String password2 = "12345"; // Требуемый пароль.
        try {
            if (password.toLowerCase().equals(password2)) { // Сравниваем пароли с помощью метода equals().
                System.out.println("Пароль подтвержден.");
            } else {
                System.out.println("Неверный пароль.");
            }
        } catch (Exception e) {
            System.out.println("Требуется ввод пароля.");
        }
    }
}
