class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int num =0;
        if(nums.length==1)
        num = nums[0];
        // if(nums.length==3){
        //     if(nums[0]==nums[1]){
        //         num = nums[2];
        //     }
        //     else
        //     num = nums[0];
        // }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
            num = nums[i];
            break;
            }
            else
            num = nums[nums.length-1];
        }
        return num;
    }
}