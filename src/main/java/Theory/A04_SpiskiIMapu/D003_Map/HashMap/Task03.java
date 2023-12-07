package Theory.A04_SpiskiIMapu.D003_Map.HashMap;

import java.util.*;

/**
 * Задание №3. Создайте HashMap, в котором ключами будут названия продуктов, а значениями - их цены.
 * Добавьте несколько продуктов и их цены в HashMap, затем напишите программу, которая будет запрашивать
 * у пользователя название продукта и выводить его цену.
 */
public class Task03 {
    public static void main(String[] args) {
        HashMap<String, Integer> shop = new HashMap<String, Integer>();
        shop.put("яблоко", 100);
        shop.put("апельсин", 120);
        shop.put("персик", 200);
        shop.put("абрикос", 110);
        shop.put("гранат", 250);
        shop.put("мандарин", 130);
        shopPrice(shop);
    }
    public static void shopPrice(HashMap<String, Integer> shop) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите названия продукта чтобы узнать его цену: ");
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);
        boolean found = false;
        for (Map.Entry<String, Integer> entry : shop.entrySet()) {
            String nameProduct = entry.getKey();
            int priceProduct = entry.getValue();
            if (Objects.equals(nameProduct, input)) {
                System.out.println("Цена продукта " + nameProduct + ": " + priceProduct);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Продукта " + input + " в магазине нет.");
        }
    }
}
