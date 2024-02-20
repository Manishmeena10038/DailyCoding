class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long sum = n*(n+1)/2;
        long sum2 = 0;
        for(int i:nums){
            sum2+=i;
        }
        return (int)(sum-sum2);
        

    }
}