package Theory.A03_Functions.C005_SozdaniyeSpisochnykhMassivov;

import java.util.ArrayList;

/**
 * Методы ArrayList основные:
 * <p>
 * add() - добавляет элемент в конец списка;
 * <p>
 * addAll() - добавляет все элементы из коллекции в конец списка;
 * <p>
 * clear() - удаляет все элементы из списка;
 * <p>
 * contains() - проверяет, содержит ли список указанный элемент;
 * <p>
 * get() - возвращает элемент по указанному индексу;
 * <p>
 * indexOf() - возвращает индекс первого вхождения указанного элемента;
 * <p>
 * isEmpty() - проверяет, пуст ли список;
 * <p>
 * remove() - удаляет элемент по указанному индексу;
 * <p>
 * set() - заменяет элемент по указанному индексу новым элементом;
 * <p>
 * size() - возвращает количество элементов в списке;
 * <p>
 * toArray() - возвращает массив, содержащий все элементы списка.
 */

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Альфа");
        list.add("Дельта");
        list.add("Чарли");

        System.out.println("Список: " + list);

        System.out.println("Заменяем: " + list.get(1) + "\n");
        list.set(1, "Браво");

        list.forEach((i) -> System.out.println("Элемент: " + i)); // лямбда-выражение

        System.out.println("\n");
        /**
         Без лямда-выражения. Используем цикл for-each
         */
        for (String s : list) {
            System.out.println("Элемент: " + s);
        }
    }
}
