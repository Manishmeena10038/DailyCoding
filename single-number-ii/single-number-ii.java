class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i,j,frequency;
        int temp =0;
        for(i=0;i<n;i++){
            frequency = 1;
         for(j=i+1; j<n; j++){
            if(nums[j] == nums[i]){
               frequency++;
            } else {
               break;
            }
         }
         i=j-1;
         if(frequency <=1){
             return nums[i];
             
         }
                
            }
        
        
        return temp;
    }
}