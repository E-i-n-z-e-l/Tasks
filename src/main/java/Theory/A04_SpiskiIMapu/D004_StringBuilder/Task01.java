package Theory.A04_SpiskiIMapu.D004_StringBuilder;

/**
 * Задание №1. Создайте StringBuilder, добавьте строку "Hello", затем добавьте "World" и напечатайте результат.
 */
public class Task01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ")
                .append("World!");
        System.out.println(sb.toString());
    }
}
