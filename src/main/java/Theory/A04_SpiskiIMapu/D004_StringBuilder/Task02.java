package Theory.A04_SpiskiIMapu.D004_StringBuilder;

/**
 * Задание №2. Напишите метод, который принимает StringBuilder и возвращает его длину.
 */
public class Task02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("task").append(" Two");
        System.out.println(sbLength(sb));
    }
    public static int sbLength(StringBuilder sb) {
        return sb.length();
    }
}
