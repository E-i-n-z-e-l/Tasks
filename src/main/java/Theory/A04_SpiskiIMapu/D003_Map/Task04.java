package Theory.A04_SpiskiIMapu.D003_Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Задание №4. Создайте HashMap, в котором ключами будут являться названия месяцев, а значениями - количество дней
 * в каждом месяце. Добавьте все месяцы и их количество дней в HashMap, затем выведите все месяцы и их количество дней.
 */
public class Task04 {
    public static void main(String[] args) {
        HashMap<String,Integer> monthsDays = new HashMap<String,Integer>();
        monthsDays.put("January", 31);
        monthsDays.put("February", 28);
        monthsDays.put("March", 31);
        monthsDays.put("April", 30);
        monthsDays.put("May", 31);
        monthsDays.put("June", 30);
        monthsDays.put("July", 31);
        monthsDays.put("August", 31);
        monthsDays.put("September", 30);
        monthsDays.put("October", 31);
        monthsDays.put("November", 30);
        monthsDays.put("December", 31);
        monthsDays(monthsDays);
    }
    public static HashMap<String,Integer> monthsDays(HashMap<String,Integer> months) {
        for (Map.Entry<String,Integer> entry : months.entrySet()) {
            System.out.println(entry.getKey() + " - \t\t\t" + entry.getValue());
        }
        return months;
    }

}
