package Theory.A04_SpiskiIMapu.D003_Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Задание №12. Создайте HashMap, в котором ключами будут названия компаний, а значениями - их доходы
 * за последний год. Добавьте несколько компаний и их доходы в HashMap, затем напишите программу, которая
 * будет выводить список компаний с доходами выше заданного значения.
 */
public class Task12 {
    public static void main(String[] args) {
        HashMap<String, Integer> incomeCompany = new HashMap<String, Integer>();
        incomeCompany.put("Стройкомплекс", 15000000);
        incomeCompany.put("Бристоль", 45000000);
        incomeCompany.put("Музей Победы", 300000);
        incomeCompany.put("Командор", 75000000);
        incomeCompany.put("Слата", 150000000);
        incomeCompany.put("Арес", 600000);
        seeCompany(incomeCompany);
        bigIncome(incomeCompany);
    }
    public static void seeCompany(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    public static void bigIncome(HashMap<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемый доход (и выше) компании за один год: ");
        int income = Integer.parseInt(scanner.nextLine());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String company = entry.getKey();
            int incomeCompany = entry.getValue();
            if (incomeCompany > income) {
                System.out.println(company);
            }
        }
    }
}
