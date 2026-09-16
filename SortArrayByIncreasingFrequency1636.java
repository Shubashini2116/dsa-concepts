import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        int[] f = new int[201];
        for (int x : nums) f[x + 100]++;

        Integer[] a = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) a[i] = nums[i];

        Arrays.sort(a, (x, y) -> {
            if (f[x + 100] != f[y + 100])
                return f[x + 100] - f[y + 100];
            return y - x;
        });

        for (int i = 0; i < nums.length; i++)
            nums[i] = a[i];

        return nums;
    }
}