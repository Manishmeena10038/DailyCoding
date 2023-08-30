class Solution {
    public long minimumReplacement(int[] nums) {
       int n = nums.length;
       int max = nums[n-1];
       long ans =0;
       for(int i = n-2;i>=0;i--){
           final int ops = (nums[i]-1)/max;
           ans+=ops;
           max = nums[i]/(ops+1);

       }
        return ans;
    }
}