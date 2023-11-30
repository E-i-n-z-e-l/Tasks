package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * **Итератор** - это объект, который предоставляет методы для последовательного доступа и обхода элементов
 * в коллекции, такой как ArrayList, LinkedList, HashSet и других.
 * <p>
 * Основные методы итератора:<p>
 * - **hasNext()**: Проверяет, есть ли следующий элемент в коллекции.<p>
 * - **next()**: Возвращает следующий элемент в коллекции.<p>
 * - **remove()**: Удаляет текущий элемент, на который указывает итератор.
 */
public class Task18Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
/*
Здесь list.iterator() возвращает экземпляр итератора для объекта ArrayList, а затем мы используем методы
hasNext() и next() для обхода элементов коллекции.

Итератор предоставляет удобный и безопасный способ обхода элементов в коллекции, а также возможность удалять
элементы во время процесса итерации.

В то время как цикл for и метод forEach (введенный в Java 8) обеспечивают более удобный синтаксис для обхода
коллекций, использование итератора полезно в случаях, когда нужно удалять элементы из коллекции во время обхода.
 */
