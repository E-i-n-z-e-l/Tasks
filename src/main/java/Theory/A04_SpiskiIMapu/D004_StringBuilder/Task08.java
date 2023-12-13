package Theory.A04_SpiskiIMapu.D004_StringBuilder;

/**
 * Задание №8. Напишите программу, которая объединяет несколько StringBuilder в один и выводит результат.
 */
public class Task08 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("aaa ");
        StringBuilder sb2 = new StringBuilder("bbb ");
        StringBuilder sb3 = new StringBuilder("ccc");
        foldingSB(sb1, sb2, sb3);
    }
    public static void foldingSB (StringBuilder sb1, StringBuilder sb2, StringBuilder sb3) {
        sb1.append(sb2.toString());
        sb1.append(sb3.toString());
        System.out.println(sb1);
    }
}
