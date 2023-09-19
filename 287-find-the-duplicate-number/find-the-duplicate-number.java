class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int fr =0;
        for(int i=1;i<nums.length;i++){
            if((nums[i-1] + nums[i])/2==nums[i]) {
                fr = nums[i];
                return fr;
            }
        }
        return fr;
    }
}