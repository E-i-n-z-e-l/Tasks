package Theory.Reflection_API.TaskFromSeminarTwo.Task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

    /**
     * Задача 1: Основы Reflection API
     * <p><p/>
     * 1. Получите информацию о классе "Person" с использованием Reflection API:
     * <p>
     * 2. Выведите на экран все поля и методы класса.
     * <p>
     * 3. Создайте экземпляр класса "Person" с использованием Reflection API,
     * установите значения полей и вызовите методы.
     * <p>
     * 4. Реализуйте обработку исключений для обеспечения корректного взаимодействия
     * с Reflection API.
     */

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        /* Сначала мы загружаем класс "Person" с использованием метода Class.forName().  */
        Class<?> personalClass = Class.forName("Theory.Reflection_API.TaskFromSeminarTwo.Task1.Person");


        Field[] fields = personalClass.getDeclaredFields(); // Получаем все поля класса;
        /* Метод getDeclaredFields() возвращает массив объектов Field, представляющих поля класса "Person". */
        /* Перебираем массив и выводим на экран названия всех полей: */
        for (Field field : fields) {
            System.out.println("Поле: " + field.getName());
        }


        /* Получаем список всех конструкторов класса с помощью getConstructors().
        Метод getConstructors() возвращает массив объектов Constructor, представляющих все конструкторы
        класса "Person".
        В данном коде мы используем первый конструктор (индекс 0) для создания экземпляра класса. */
        Constructor[] constructors = personalClass.getConstructors();


        /* Создаем экземпляр класса "Person" с помощью выбранного конструктора, используя метод newInstance()
        объекта Constructor.
        В данном коде мы передаем значение null в качестве аргумента конструктору, так как у конструктора
        класса "Person" нет параметров. */
        Object personInstance = constructors[0].newInstance(null); // Метод newInstance() создает
                                                                           // новый экземпляр класса "Person";

        /* Получаем доступ к приватным полям класса, чтобы установить значения.
        Для этого мы вызываем getDeclaredField() с именем поля в качестве параметра. */
        Field nameField = personalClass.getDeclaredField("name");
        nameField.setAccessible(true); // Вызываем setAccessible(true), чтобы разрешить доступ к приватным полям;
        /*  Используем метод set() класса Field, чтобы установить значения для полей "name" и "age"
        экземпляра класса "Person" */
        nameField.set(personInstance, "Alice");

        Field ageField = personalClass.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(personInstance, 30);

        /* Получаем доступ к методу "displayInfo" с помощью getDeclaredMethod(), передавая
        имя метода в качестве параметра. */
        Method displayInfoMethod = personalClass.getDeclaredMethod("displayInfo");
        /* Затем мы вызываем метод invoke() объекта Method, чтобы вызвать метод "displayInfo"
        для экземпляра класса "Person". */
        displayInfoMethod.invoke(personInstance);
    }
}
