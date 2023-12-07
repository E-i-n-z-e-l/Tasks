package Theory.A04_SpiskiIMapu.D003_Map.HashMap;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

/**
 * Задание №6. Создайте HashMap, в котором ключами будут названия предметов, а значениями - их оценки.
 * Добавьте несколько предметов и их оценки в HashMap, затем напишите программу, которая будет запрашивать
 * у пользователя название предмета и выводить его оценку.
 */
public class Task06 {
    public static void main(String[] args) {
        HashMap<String, Integer> journal = new HashMap<String, Integer>();
        journal.put("Математика", 3);
        journal.put("История", 5);
        journal.put("Обществознание", 4);
        journal.put("Химия", 3);
        journal.put("Биология", 3);
        journal.put("Физика", 4);
        journal.put("Музыка", 5);
        journalShow(journal);
        giveMeJournal(journal);
    }

    /**
     * Вывод HashMap в терминал.
     * @param journal
     */
    public static void journalShow (HashMap<String, Integer> journal) {
        for (HashMap.Entry<String, Integer> entry : journal.entrySet()) {
            System.out.println(entry.getKey() + " - оценка - " + entry.getValue());
        }
    }
    public static void giveMeJournal (HashMap<String, Integer> journal) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите интересующий вас предмет: ");
        String input = scanner.nextLine();
        boolean s = false;
        for (HashMap.Entry<String, Integer> entry : journal.entrySet()) {
            String article = entry.getKey();
            int grade = entry.getValue();
            if (Objects.equals(article, input)) {
                System.out.println("Оценка по этому предмету: " + grade);
                s = true;
                break;
            }
        }
        if (!s) {
            System.out.println("Данных о таком предмете нет.");
        }

    }

}
