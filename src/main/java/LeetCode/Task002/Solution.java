package LeetCode.Task002;

/**
 Дано целое число x. Вернуть true, если x является палиндромом
 (читается одинаково слева направо и справа налево), и false в противном случае.
 */
public class Solution {
    /**
     * Метод поиска палиндромома через математические операции.
     * @param x
     * @return true
     */
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {  // Если x < 0, то возвращаем false. Также проверям числа
                                                // заканчивающиеся на 0
            return false;
        }

        int reverse = 0;  // Создаем переменную reverse и инициализируем ее нулем.
                         // Внутри цикла метод умножает переменную reverse на 10 и добавляет остаток от деления
                        // x на 10 (это позволяет перевернуть число). Затем метод делит x на 10 и продолжает цикл.
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;   // После завершения цикла метод проверяет, является ли x равным reverse
                         // или reverse, разделенному на 10 (это нужно для случая, когда число
                        // имеет нечетное количество цифр).
        }
        return x == reverse || x == reverse / 10;
    }

    /**
     * Метод поиска палиндромома через строку (String).
     * @param x
     * @return true
     */
    public boolean isPalindrome2(int x) {
        String str = Integer.toString(x);
        for (int i = 0, j = str.length() - 1; i < j;) {
            if (str.charAt(i)!= str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(10));

    }

}
