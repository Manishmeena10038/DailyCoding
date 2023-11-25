class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        for(int i=0;i<n;i++){
            res[0]+= (nums[i]-nums[0]);
        }

        for(int i=1;i<n;i++){
            res[i] = res[i-1] + (nums[i]-nums[i-1])*i - (nums[i] - nums[i-1])*(n-i);
        }
        System.gc();
        return res;
    }
    
}