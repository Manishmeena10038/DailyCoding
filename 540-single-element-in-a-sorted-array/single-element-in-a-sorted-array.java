class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int i=0;
        while(i<nums.length-1){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
            i+=2;
        }
        return nums[nums.length-1];
    }
}














// class Solution {
//     public int singleNonDuplicate(int[] nums) {
        
//         int num =0;
//         if(nums.length==1)
//         num = nums[0];
//         // if(nums.length==3){
//         //     if(nums[0]==nums[1]){
//         //         num = nums[2];
//         //     }
//         //     else
//         //     num = nums[0];
//         // }
//         for(int i=0;i<nums.length-1;i+=2){
//             if(nums[i]!=nums[i+1]){
//             num = nums[i];
//             break;
//             }
//             else
//             num = nums[nums.length-1];
//         }
//         return num;
//     }
// }