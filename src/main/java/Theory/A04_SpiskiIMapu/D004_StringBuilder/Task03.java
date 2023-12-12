package Theory.A04_SpiskiIMapu.D004_StringBuilder;

/**
 * Задание №3. Создайте StringBuilder, вставьте строку "I love Java" между "I" и "Java" и выведите результат.
 */
public class Task03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("I ").append(" Java");
        System.out.println(sb.toString());
        sb.insert(2, "love");
        System.out.println(sb.toString());
    }
}
