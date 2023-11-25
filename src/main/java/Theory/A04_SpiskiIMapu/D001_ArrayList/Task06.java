package Theory.A04_SpiskiIMapu.D001_ArrayList;

import ArkhitekturaPO.Practocal.Practical10.Product;

import java.util.ArrayList;

import static Theory.A04_SpiskiIMapu.D001_ArrayList.Task06.Product.highestCost;

/**
 * Задача №6. Создайте ArrayList объектов класса Product (с полями name, price и quantity) и напишите программу,
 * которая найдет товар с наибольшей стоимостью (price * quantity).
 */
public class Task06 {
    public static class Product {
        private final String name;
        private final int price;
        private final int quantity;

        public Product(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public static int highestCost(ArrayList<Product> products) {
            int maxCost = 0;
            for (Product p : products) {
                int minCost = p.getPrice() * p.getQuantity();
                if (minCost > maxCost) {
                    maxCost = minCost;
                }
            }
            return maxCost;
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 10, 100));
        products.add(new Product("Melon", 20, 120));
        products.add(new Product("Orange", 15, 80));
        products.add(new Product("Lemon", 12, 25));
        products.add(new Product("Peach", 25, 75));
        int max = highestCost(products);
        System.out.println(max);
    }
}
