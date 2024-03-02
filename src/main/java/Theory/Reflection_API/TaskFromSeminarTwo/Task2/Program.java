package Theory.Reflection_API.TaskFromSeminarTwo.Task2;

import java.lang.reflect.Field;

/**
 * Задача 2: Применение Reflection API в разработке.
 * <p\></p\>
 * 1. Реализуйте обобщенный метод, который принимает объект и выводит в консоль значения всех его полей.
 * <p\></p\>
 * 2. Создайте класс "Car" с различными полями (например, модель, цвет, год выпуска).
 * <p\></p\>
 * 3. Примените Reflection API для вывода значений полей созданного объекта класса "Car"
 * с использованием ранее созданного метода.
 */

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        Car car = new Car("Toyota", "Blue", 2022);
        task2(car);
    }

    private static <T> void task2 (T obj) throws IllegalAccessException {
        /* Получаем объект Class для типа объекта, переданного в качестве аргумента,
        с использованием метода getClass(). */
        Class<?> objClass = obj.getClass();

        /* Вызываем метод getDeclaredFields() класса Class, чтобы получить полный список
        всех полей этого типа объекта. Метод getDeclaredFields() возвращает массив объектов Field,
        представляющих все поля класса. */
        Field[] fields = objClass.getDeclaredFields();

        /* Перебираем массив полей и для каждого поля вызываем setAccessible(true), чтобы разрешить доступ
        к закрытому полю. Затем мы выводим имя поля и его значение с помощью getName() и get() соответственно. */
        for (Field field : fields){
            field.setAccessible(true); // Разрешаем доступ к закрытому полю;
            System.out.printf("%s: %s\n", field.getName(), field.get(obj));
        }
    }
}
