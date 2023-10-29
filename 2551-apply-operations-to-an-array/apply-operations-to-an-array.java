class Solution {
    public int[] applyOperations(int[] nums) {
        // if(nums.length==2){
        //     int temp = nums[0];
        //     nums[0]=nums[1];
        //     nums[1] = temp;
        // }
        int [] num = new int[nums.length];
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                num[i-1] = nums[i-1]*2;
                
                nums[i]=0;
                 num[nums.length-1]=0;
            }
            else{
                num[i-1]=nums[i-1];
                num[nums.length-1]=nums[nums.length-1];
            }
       }
       int j =0;
       int k = 0;
       int s = nums.length-1;
       while(j<nums.length){
           if(num[j]==0){
               nums[s]=num[j];
               s--;
           }else{
               nums[k]=num[j];
               k++;
           }

           j++;

       }
       return nums;
                
    }
}