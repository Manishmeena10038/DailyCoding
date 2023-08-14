class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i;
        int count = 0;
        // for(i=n-1;i>=0;i--){
        //     count++;
        //     if(count == k){
        //         return nums[i];
        //     }
        // }return nums[i];
        return nums[n-k];          
    }
}