class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curr = 0, left = 0, right, ans = Integer.MAX_VALUE;
        for(right = 0; right < nums.length; right++){
            curr += nums[right];
            while(curr >= target){
                ans = Math.min(ans, right - left + 1);
                curr -= nums[left];
                left += 1;
            }
        }

        System.gc();
        return ans != Integer.MAX_VALUE ? ans : 0;
    }
}