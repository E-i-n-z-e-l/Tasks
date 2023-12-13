package Theory.A04_SpiskiIMapu.D004_StringBuilder;

/**
 * Задание №9. Напиши метод, который принимает StringBuilder и разбивает его содержимое на слова,
 * после чего выводит каждое слово на новой строке.
 */
public class Task09 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Task 09 String Builder studying");
        parseSB(sb);
    }

    public static void parseSB(StringBuilder sb) {
        String s = sb.toString();
        String[] words = s.split("\\s+");

        for (String word : words) {
            System.out.println(word);
        }

    }
}
