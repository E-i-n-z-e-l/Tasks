package Theory.A04_SpiskiIMapu.D003_Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Задание №7. Напишите программу, которая будет принимать на вход список имен студентов и их средние оценки,
 * а затем выводить имена студентов, у которых средний балл выше заданного значения.
 */
public class Task07 {
    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<String, Double>();
        students.put("Александров", 4.5);
        students.put("Борисов", 4.5);
        students.put("Вованов", 4.1);
        students.put("Гошанов", 4.9);
        students.put("Еланов", 3.4);
        students.put("Жопов", 2.7);
        journalStudents(students);
        System.out.println("----------------------------------------------------------------");
        bestStudents(students);
    }
    public static void journalStudents (HashMap<String, Double> students) {
        for (HashMap.Entry<String, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    public static void bestStudents (HashMap<String, Double> students) {
        double GPA = 4.0;
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() >= GPA) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
