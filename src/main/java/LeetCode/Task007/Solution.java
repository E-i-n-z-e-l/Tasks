package LeetCode.Task007;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Учитывая массив вернуть чаще всего встречаемый элемент
 * (В условиях задачи это элемент который появляется более чем [n / 2] раз.
 */
public class Solution {
    /**
     * Самый долгий метод.
     * <p>
     * Сначала отсортируем массив, а потом будем искать количество повторений значения
     * который появляется более чем [n / 2] раз.
     * @param nums
     * @return
     */
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 0;
        int majorElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    majorElement = nums[i];
                }
            } else {
                count = 1;
            }
        }
        return majorElement;
    }

    /**
     * Решаем с помощью HashMap.
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int majorityElement = 0;

        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }

            if (countMap.get(num) > maxCount) {
                maxCount = countMap.get(num);
                majorityElement = num;
            }
        }
        return majorityElement;
    }

    /**
     * Этот код использует алгоритм Бойера-Мура для поиска потенциального основного элемента в массиве.
     * Затем он проверяет его фактическое вхождение и возвращает его, если он является основным элементом.
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;

        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
                count = 1;
            } else if (num == majorityElement) {
                count++;
            } else {
                count--;
            }
        }
        // Проверяем фактическое вхождение потенциального основного элемента
        count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return majorityElement;
        } else {
            return -1; // если основного элемента нет
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] numsOne = new int[]{3, 2, 3};
        System.out.println(solution.majorityElement(numsOne));

        int[] numsTwo = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(numsTwo));
    }
}
