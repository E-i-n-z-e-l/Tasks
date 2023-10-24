package Theory;

import java.util.Scanner;

/**
 * Перехват исключений - try-catch.
 * В блоке try главный метод.
 *
 * В блоке catch перехватываем ошибки - в первом блоке просим пользователя ввести число если таковое он
 * не ввел, во втором блоке ловим ошибку, если пользователь ввел не число.
 *
 * В блоке finally пишем код, который будет выполняться в любом случае независимо от ошибок.
 */
public class TryCatch11 {
    public static void main(String[] args) {
        try
        {
            int num = Integer.parseInt("1"); // С помощью Integer.parseInt() переводим строку в число.
            System.out.println("Вы ввели: "+ num);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Требуется целочисленный аргумент.");
        }
        catch( NumberFormatException e ) {
            System.out.println("Неверный формат аргумента.");
        }
        finally {
            System.out.println("Программа завершила работу.");
        }
    }
}
