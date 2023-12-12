package Theory.A04_SpiskiIMapu.D004_StringBuilder;

/**
 * Задание №6. Напишите программу, которая заменяет определенную подстроку в StringBuilder на другую строку.
 */
public class Task06 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Я люблю Java");
        System.out.println(sb.toString());
        replacementString(sb);
    }
    public static void replacementString(StringBuilder sb) {
        sb.replace(8, 13, "Python");
        System.out.println(sb.toString());
    }
}
