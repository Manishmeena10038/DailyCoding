class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int low=lower-nums[i];
            int high=upper-nums[i];
            long l=help1(nums,i+1,low);
            long h=help2(nums,i+1,high);
            ans+=h-l;
        }
        return ans;
    }
    public long help2(int[] nums,int s,int high) {
        int end = nums.length;
        while (s < end) {
            int mid = (s+end) / 2;
            if (nums[mid] >high) {
                end = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
     public long help1(int[] nums,int s,int low) {
        int end = nums.length;
        while (s < end) {
            int mid = (s+end)/ 2;
            if (nums[mid] < (low)) {
                s = mid + 1;
            } else {
                end = mid;
            }
        }
        return s;
    }
    
    
}
