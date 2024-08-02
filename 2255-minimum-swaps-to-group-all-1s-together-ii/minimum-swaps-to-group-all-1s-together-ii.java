class Solution {
    public int minSwaps(int[] nums) {
        // int arr[] = new int[2*nums.length];
        int maxone=0;
        int i =0;
        int ones = 0;
        int one = 0;
        int  rightone = 0;
        int k=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int j:nums){
                if(j==1)
                ones++;
            }
        while(i<ones){
            if(nums[i]==1){
                rightone++;
            }
            i++;
        }
        int leftone=0;
        
        while(i<2*nums.length){
            int curone = rightone-leftone;
            maxone = Math.max(curone,maxone);
            if(nums[i%nums.length]==1){
                rightone++;
            }
            if(nums[(i-ones)%nums.length]==1){
                leftone++;
            }
            
            i++;
        }

        
        return ones-maxone;
        
    }
}