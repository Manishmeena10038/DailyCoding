import java.util.HashMap;

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        long ans = 0;
        int min_i = -1, max_i = -1, waste_i = -1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] < minK || nums[i] > maxK)
                waste_i = i;
            if (nums[i] == minK)
                min_i = i;
            if (nums[i] == maxK)
                max_i = i;
            long temp = Math.min(max_i, min_i) - waste_i;
            ans += Math.max(0, temp);
        }
        return ans;
    }
}