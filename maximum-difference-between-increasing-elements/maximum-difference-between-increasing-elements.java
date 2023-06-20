class Solution {
    public int maximumDifference(int[] nums) {
        int diff = 0;
        int max = 0;
        int n = nums.length;
        for(int i=n-1;i>=0;i--){
            for(int j =0;j<i;j++){
               
                    diff = nums[i]-nums[j];
                    max = Math.max(max,diff);
                    
                
            }
        }
        if(max<=0){
                        return -1;
                    }
        return max;
        
    }
}