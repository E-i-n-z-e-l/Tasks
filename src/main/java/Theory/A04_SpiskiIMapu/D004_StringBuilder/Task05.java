package Theory.A04_SpiskiIMapu.D004_StringBuilder;

/**
 * Задание №5. Создайте метод, который принимает StringBuilder, разворачивает его содержимое и возвращает результат.
 */
public class Task05 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Task 05");
        System.out.println(sb.toString());
        sbExpand(sb);
        System.out.println(sb.toString());
    }
    public static StringBuilder sbExpand(StringBuilder sb) {
        return sb.reverse();
    }
}
