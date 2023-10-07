class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int arr[] = new int[2];
        int m =0;
        int rem =0;
        int i=1;
        if(nums.length == 1 ){
            arr[0]=0;
            arr[1]=1;
        }
        else{
        while(i<nums.length){
            if(nums[i-1]==nums[i]){
                m++;
                 i++;
            }
            
         i++;
        
        }
        arr[0]=m;
        arr[1]=nums.length-m*2;
        }
        return arr;
    }
}