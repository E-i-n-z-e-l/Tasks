package LeetCode.Task003;

import java.util.HashMap;

/**
 Дана римская цифра, преобразуйте ее в целое число.
 */
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            if (curr > prev) {
                result -= prev;
            } else {
                result += prev;
            }
            prev = curr;
        }
        result += prev;
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("IV"));
    }
}

// ПОТОМ РАЗОБРАТЬ!!!