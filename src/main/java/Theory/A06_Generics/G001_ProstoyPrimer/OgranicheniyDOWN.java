package Theory.A06_Generics.G001_ProstoyPrimer;

import java.util.ArrayList;
import java.util.List;

/**
 * В этом примере ограничение T super Integer означает, что параметр типа T должен быть супертипом
 * класса Integer или самим классом Integer. Мы создаем объект intBox типа Box<Integer> и добавляем
 * целочисленные значения с помощью метода addItem(). Благодаря ограничению снизу, мы можем безопасно
 * добавлять значения типа Integer в список, который ограничен его супертипом T.
 * @param <T>
 */
public class OgranicheniyDOWN<T> {
    private List<? super T> items;
    public OgranicheniyDOWN() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void printItems() {
        for (Object item : items) {
            System.out.println(item);
        }
    }
}
class MainDown {
    public static void main(String[] args) {
        OgranicheniyDOWN<Integer> intBox = new OgranicheniyDOWN<>();
        intBox.addItem(10); // корректно, Integer является супертипом Integer;
        intBox.addItem(20); // корректно, Integer является супертипом Integer;
        // intBox.addItem(" "); // Не даст сделать так как тип не Integer;
        intBox.printItems(); // Output: 10, 20
    }
}
