package Theory.A04_SpiskiIMapu.D003_Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * Задание №8. Создайте HashMap, в котором ключами будут являться названия городов, а значениями - их население.
 * Добавьте несколько городов и их население в HashMap, затем напишите программу, которая будет запрашивать у
 * пользователя название города и выводить его население.
 */
public class Task08 {
    public static void main(String[] args) {
        HashMap<String, Integer> city = new HashMap<String, Integer>();
        city.put("Москва", 12000000);
        city.put("Севастополь", 300000);
        city.put("Ангарск", 200000);
        city.put("Иркутск", 650000);
        city.put("Братск", 220000);
        city.put("Казань", 1000000);
        seeSity(city);
        giveSity(city);
    }
    public static void seeSity(HashMap<String, Integer> city) {
        for (Map.Entry<String, Integer> entry : city.entrySet()) {
            System.out.println("Город " + entry.getKey() + " имеет население: " + entry.getValue());
        }
    }
    public static void giveSity(HashMap<String, Integer> city) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города: ");
        String input = scanner.nextLine();
        boolean fail = false;
        for (Map.Entry<String, Integer> entry : city.entrySet()) {
            String nameCity = entry.getKey();
            Integer population = entry.getValue();
            if (Objects.equals(nameCity, input)) {
                System.out.println("Население города " + nameCity + " - " + population + " человек.");
                fail = true;
                break;
            }

        }
        if (!fail) {
            System.out.println("такого города нет в базе данных.");
        }
    }
}
