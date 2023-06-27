class Solution {
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
       int min = nums[0];
       int max = nums[nums.length-1];
       int num = 1;
       int gcd = 0;
       if(min == max){
           return min;
       }
    while(num<=min){
        if(min%num==0 && max%num==0){
            gcd = num;
        }
        num++;      
    }   
        return  gcd;       
    }
}