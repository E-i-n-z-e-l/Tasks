package Theory.A04_SpiskiIMapu.D004_StringBuilder;

/**
 * Задание №4. Напишите программу, которая удаляет определенную подстроку из StringBuilder.
 */
public class Task04 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("task ").append("04");
        System.out.println(sb.toString());
        sb.delete(5, 7);
        System.out.println(sb.toString());
    }
}
