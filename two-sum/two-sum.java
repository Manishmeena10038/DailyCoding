class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int pair[] = new int[2];
        int i,j;
        for( i=0;i<n;i++){
            for(j =0;j<n;j++){
                if(i!=j && nums[i]+nums[j]==target){
                    pair[0] = i;
                    pair[1] = j;
                    return pair;
                }
            }
        }return pair;
        
    }
}