class Solution {
    public int[] countBits(int n) {
        int[] nums = new int[n+1];
        for(int i=1;i<=n;i++){
            nums[i] = nums[i>>1]+(i&1);
            
        }
        return nums;
    }
}