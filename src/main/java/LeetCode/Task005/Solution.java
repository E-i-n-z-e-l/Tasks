package LeetCode.Task005;

import java.util.Arrays;

/**
 * В задаче нужно удалить все вхождения числа val из массива nums и вернуть количество элементов,
 * которые остались после удаления.
 * <p>
 * При этом порядок оставшихся элементов может быть изменен, но важно, чтобы первые k элементов содержали
 * только те, которые не равны val.
 */
public class Solution {
    /**
     * Проверяю что происходит с массивом во время работы метода removeElement().
     * @param nums
     * @param val
     * @return
     */
    public int[] removeElementNew(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return nums;
    }

    /**
     * Метод ищет значения val и "удаляет" (заменяет) их.
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    /**
     * Метод ищет значения val в массиве и считает сколько значений в массиве остаются если убрать все val.
     * @param nums
     * @param val
     * @return
     */
    public int removeElementMy(int[] nums, int val) {
        Arrays.sort(nums);
        int arrLength = nums.length;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == val) {
                arrLength = arrLength - 1;
            }
        }
        return arrLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] numsOne = new int[]{3, 2, 2, 3};
        int valOne = 3;
        System.out.println(solution.removeElement(numsOne, 3));
        System.out.println(Arrays.toString(solution.removeElementNew(numsOne, 3)));

        int[] numsTwo = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int valTwo = 2;
        System.out.println(solution.removeElement(numsTwo, 2));
        System.out.println(Arrays.toString(solution.removeElementNew(numsTwo, 2)));
    }
}
