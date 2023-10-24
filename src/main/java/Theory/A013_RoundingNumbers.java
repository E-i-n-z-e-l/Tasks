package Theory;

/**
 Методы округления чисел и методы поиска наибольшего и наименьшего числа.
 */

public class A013_RoundingNumbers {
    public static void main(String[] args) {
        float num = 7.25f;
        System.out.println(num + " округленное равно " + Math.round(num)); // Math.round - округление обычное.
        System.out.println(num + " округленное вниз равно " + Math.floor(num)); // Math.floor - округление вниз;
        System.out.println(num + " округленное вверх равно " + Math.ceil(num)); // Math.ceil - округление вверх;

        float num1 = 24.75f;
        int num2 = 25;
        System.out.println("Наибольшее: " + Math.max(num1, num2));
        System.out.println("Наименьшее: " + Math.min(num1, num2));
    }
}
