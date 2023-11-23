package LeetCode.Task006;

/**
 * Учитывая целочисленный массив nums, отсортированный в неубывающем порядке, удалите дубликаты на месте таким образом,
 * чтобы каждый уникальный элемент появлялся только один раз. Относительный порядок элементов должен оставаться таким
 * же. Затем верните количество уникальных элементов в nums.
 * <p>
 * Считайте количество уникальных элементов nums равным k, чтобы ваше решение было принято, вам нужно сделать следующее:
 * <p>
 * 1. Измените массив nums так, чтобы первые k элементов nums содержали уникальные элементы в том порядке,
 * в котором они изначально присутствовали в nums. Остальные элементы nums не важны, также как и размер nums.
 * <p>
 * 2. Верните k.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // переменная для отслеживания уникальных элементов
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] numsOne = new int[]{1, 1, 1, 2, 2};
        System.out.println(solution.removeDuplicates(numsOne));

        int[] numsTwo = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    }
}
