class Solution {
    public long countSubarrays(int[] nums, long k) {
        
        int n = nums.length;
        long cnt =0;
       
        long s = 0;
       
        
        for(int i=0,j=0;i<n;i++){
            s+=nums[i];
            while(s*((i-j)+1)>=k)
                s-=nums[j++];
                
            
            cnt+=i-j+1;
        }
         return cnt;   
    }
}