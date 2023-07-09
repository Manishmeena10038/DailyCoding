class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 1; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                //int sum = nums[j] + nums[j-i];
                if(nums[j] + nums[j-i] == target){
                    return new int[]{j-i,j};
                }
            }
           
        }
        return null;
           }
}











// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         int pair[] = new int[2];
//         int i,j;
//         for( i=0;i<n;i++){
//             for(j =0;j<n;j++){
//                 if(i!=j && nums[i]+nums[j]==target){
//                     pair[0] = i;
//                     pair[1] = j;
//                     return pair;
//                 }
//             }
//         }return pair;
        
//     }
// }