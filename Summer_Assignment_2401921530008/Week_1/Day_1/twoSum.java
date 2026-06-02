import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // sort indices based on values in nums
        Arrays.sort(idx, (a, b) -> nums[a] - nums[b]);

        int left = 0, right = n - 1;

        while (left < right) {
            int sum = nums[idx[left]] + nums[idx[right]];

            if (sum == target) {
                return new int[]{idx[left], idx[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }
}