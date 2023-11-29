package Theory.A04_SpiskiIMapu.D001_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

import static Theory.A04_SpiskiIMapu.D001_ArrayList.Task13.Order.statusOrderOne;

/**
 * Создайте ArrayList объектов класса Order (с полями id, totalPrice и status) и напишите программу, которая разделит
 * заказы на два списка: один со статусом "выполнен", другой - "не выполнен".
 */
public class Task13 {
    public static class Order implements Comparable<Order> { // Имплементация интерфейса Comparable<>. Нужно указать к какому объекту.
        private final int id;
        private final int totalPrice;
        private final String status;

        public Order(int id, int totalPrice, String status) {
            this.id = id;
            this.totalPrice = totalPrice;
            this.status = status;
        }

        /**
         * Здесь мы используем метод compareTo у класса String, который является частью интерфейса Comparable.
         * Этот метод сравнивает две строки лексикографически (по алфавиту) и возвращает отрицательное целое
         * число, ноль или положительное целое число, если текущая строка меньше, равна или больше переданной
         * строке соответственно.
         *
         * @param o the object to be compared.
         * @return
         */
        @Override
        public int compareTo(Order o) { // Специальный интерфейс для сравнение объектов. Нуждается в имплементации.
            return this.status.compareTo(o.status);
        }

        public int getId() {
            return id;
        }

        public int getTotalPrice() {
            return totalPrice;
        }

        public String getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return id + ". " + "Цена - " + totalPrice + " | " + "Статус заказа - " + status + "|\n";
        }

        public static void statusOrderOne(ArrayList<Order> orders) {
            ArrayList<Order> orderTrue = new ArrayList<Order>();
            ArrayList<Order> orderFalse = new ArrayList<Order>();
            for (Order o : orders) {
                if (o.getStatus().equalsIgnoreCase("выполнен")) {
                    orderTrue.add(o);
                } else {
                    orderFalse.add(o);
                }

            }
            System.out.println("Список выполненных заказов: \n" + orderTrue);
            System.out.println("Список не выполненных заказов: \n" + orderFalse);
        }
    }

    public static void main(String[] args) {
        ArrayList<Order> shop = new ArrayList<>();
        shop.add(new Order(1, 100, "Выполнен"));
        shop.add(new Order(2, 200, "Не выполнен"));
        shop.add(new Order(3, 300, "Выполнен"));
        shop.add(new Order(4, 400, "Не выполнен"));
        shop.add(new Order(5, 500, "Не выполнен"));
        System.out.println(shop);
        statusOrderOne(shop);
    }
}
