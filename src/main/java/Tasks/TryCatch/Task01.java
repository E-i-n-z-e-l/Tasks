package Tasks.TryCatch;
import java.util.Scanner;
/**
 Напишите программу, которая запрашивает у пользователя два числа и выводит результат деления
 первого числа на второе. Если второе число равно нулю, выведите сообщение об ошибке.
 */
public class Task01 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int numberOne = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int numberTwo = scanner.nextInt();
            int result = numberOne / numberTwo;
        }
        catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя!");
        }
        finally {
            System.out.println("Программа завершила работу.");
        }
    }
}
