class Solution {
    public int repeatedNTimes(int[] nums) {
       int n = nums.length/2;
       Arrays.sort(nums);
       int count = 1;
       for(int i =0;i<2*n-1;i++){
           if(nums[i]==nums[i+1]){
               count++;
               if(count==n)
               return nums[i];
           }
       }
       return 1;
    }
}