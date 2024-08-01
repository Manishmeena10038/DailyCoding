class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sums =0;
        for(int num:nums){
            sums+=num;
        }
        long ls = 0;
        long rs = sums;
        int li = 1;
        int ri = nums.length;
        long min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ls = ls+nums[i];
            rs = sums-ls;

            li = i+1;
            ri = nums.length-li;
            
            long diff =ri!=0?Math.min(min,Math.abs(ls/li-rs/ri)):Math.min(min,Math.abs(ls/li-0));
            
             
            if(diff<min){
               min = diff;
               ans = i;
            }
        }
        return ans;
    }
}