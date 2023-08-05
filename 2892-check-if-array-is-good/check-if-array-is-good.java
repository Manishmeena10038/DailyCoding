class Solution {
    public boolean isGood(int[] nums) {
        int m = nums.length;
        int n = m-1;
        Arrays.sort(nums);
        if(m==1){
            return false;
        }
         if(nums[n]!=nums[n-1])return false;
        // }
        // if(nums[0]==nums[n]) return false;
        // if(nums[n]==nums[n-1]&&nums[n]==n){
        //     return true;
        // }
        // return false;
        Boolean t = true;
        for(int i=1;i<m;i++){
            if(i<n){
                if(nums[i-1]!=i){
                    t = false;
                }
            }
            else{
                if(nums[i]!=n)
                t = false;
            }
        }
        return t;
    }
}