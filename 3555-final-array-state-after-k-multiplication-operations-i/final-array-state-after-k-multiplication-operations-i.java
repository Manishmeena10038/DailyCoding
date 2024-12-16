class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
       while(k>0){
        
        int n = min(nums);
        nums[n]=nums[n]*multiplier;
        k--;

       }
       return nums;
    }
    public static int min(int[] nums){
        int j =Integer.MAX_VALUE;
        int ans =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<j){
                j = nums[i];
                ans = i;
            }
        }
        return ans;
    }
}