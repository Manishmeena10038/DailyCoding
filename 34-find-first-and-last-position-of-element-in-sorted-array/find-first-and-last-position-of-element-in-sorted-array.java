class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        arr[0] =-1;
        arr[1]=-1;
        int low  =0;
        int high = n-1;

        while(low<=high){
            if(nums[high]==target){
                arr[1]=high;
                break;

            }
            high--;
        }
        while(low<=high){
            if(nums[low]==target){
                arr[0] = low;
                break;
            }
            low++;
        }
        return arr;
    }
}