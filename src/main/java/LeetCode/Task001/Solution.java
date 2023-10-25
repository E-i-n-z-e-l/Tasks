package LeetCode.Task001;

import java.util.Arrays;

/**
 Дан массив целых чисел nums и целое число target. Вернуть индексы двух чисел в массиве,
 которые в сумме дают target. Можно предположить, что каждый входной набор данных будет иметь
 только одно решение, и нельзя использовать один и тот же элемент дважды. Ответ можно вернуть в
 любом порядке.

 Example 1:
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 Example 2:
 Input: nums = [3,2,4], target = 6
 Output: [1,2]

 Example 3:
 Input: nums = [3,3], target = 6
 Output: [0,1]
 */

public class Solution {
    /**
     * Метод которыцй принимает массив целых чисел nums и целое число.
     * Возвращает индексы двух чисел в массиве, сумма которых равна target.
     * @param nums
     * @param target
     * @return
     */
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 13)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));
    }
}
