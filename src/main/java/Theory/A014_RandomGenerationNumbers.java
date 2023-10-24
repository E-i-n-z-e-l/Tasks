package Theory;

/**
 Генерация случайных чисел.
 */

public class A014_RandomGenerationNumbers {
    public static void main(String[] args) {

        // Генерация просто целого числа.
        int num = (int) (Math.random() * 100);
        System.out.println(num);

        // Генерация случайного дробного числа от 0 до 1.
        float random = (float) Math.random();
        System.out.println("Случайное число: " + random);

        // Умножение случайного числа на 10.
        float multiplied = random * 10;
        System.out.println("Умноженное на 10: " + multiplied);

        // Округление случайного числа до целого.
        int randomInt = (int) Math.ceil(multiplied);
        System.out.println("Случайное целое: " + randomInt);

        // Создание массива чисел.
        int[] nums = new int[50];
        for (int i = 1; i < 50; i++) {
            nums[i] = i;
        }

        // Перемешиваем массив чисел.
        for (int i = 1; i < 50; i++) {
            int r = (int) Math.ceil(Math.random() * 49);
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
        }

        // Выводим первые 6 чисел.
        for (int i = 1; i < 7; i++) {
            System.out.print(Integer.toString(nums[i]) + " ");
        }
    }
}
