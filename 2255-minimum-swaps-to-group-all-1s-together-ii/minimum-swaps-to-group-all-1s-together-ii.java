class Solution {
    public int minSwaps(int[] nums) {
        int maxone=0,ones = 0,cnt = 0;

        for(int j:nums){
            ones+=j;
        }

        for(int i=0;i<2*nums.length;i++){
            cnt+=nums[i%nums.length];
            if(i>ones-1){
                cnt-=nums[(i-ones)%nums.length];
            }
            maxone = Math.max(maxone,cnt);
        }
        
        return ones-maxone; 
    }
}