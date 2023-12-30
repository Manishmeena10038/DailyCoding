class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int ans =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            ans = Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}