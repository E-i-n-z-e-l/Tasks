package Theory.Reflection_API.TaskFromHome;

import java.lang.reflect.Method;

/**
 * Используя Reflection API, напишите программу, которая выводит на экран все методы класса String.
 */
public class Main {
    public static void main(String[] args) {

        Class<String> stringClass = String.class;  // Получаем объект Class для класса String;

        // Получаем массив всех методов класса String:
        Method[] methods = stringClass.getDeclaredMethods();

        // Выводим названия всех методов:
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}