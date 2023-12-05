package Theory.A04_SpiskiIMapu.D003_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * Задача №1. Создайте HashMap, в котором ключами будут названия стран, а значениями - их столицы.
 * Затем напишите программу, которая будет принимать название страны от пользователя и выводить на экран её столицу.
 */
public class Task01 {
    public static void main(String[] args) {
        HashMap<String, String> country = new HashMap<String, String>(); // Создаем HashMap.
        country.put("Россия", "Москва");
        country.put("Германия", "Берлин");
        country.put("Франция", "Париж");
        country.put("Венгрия", "Будапешт");
        country.put("Испания", "Мадрид");
        System.out.println(country);
        giveMeCapital(country);
    }

    /**
     * Поиск столицы по названию страны.
     *
     * @param country
     */
    public static void giveMeCapital(HashMap<String, String> country) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите названия страны: ");
        String input = scanner.nextLine();
        boolean found = false; // Создаем переменную для отслеживания того, была ли найдена страна в HashMap.
        for (Map.Entry<String, String> entry : country.entrySet()) { // Проходимся по HashMap.
            String nameCountry = entry.getKey(); // Определяем ключи.
            String nameCapital = entry.getValue(); // Определяем значения.
            if (Objects.equals(nameCountry, input)) { // Проверяем если ключ равен введенной строке,
                System.out.println("Столица этой страны - " + nameCapital); // то выводим столицу этой страны.
                found = true; // Указываем в булевой переменной, что ключ (страна) найден.
                break; // Прекращаем поиск по ключу, так как одинаковых ключей не бывает.
            }
        }
        if (!found) { // Если страна не найдена, с помощью булевой переменной сообщаем об этом один раз.
            System.out.println("Данных о такой стране пока нет:( ");
        }
    }
}
