class Solution {
    public int minIncrementForUnique(int[] nums) {
       
        Arrays.sort(nums);

        int mini =0;
        int numt=0;
        for(int num:nums){
            numt = Math.max(numt,num);
            mini+=(numt-num);
            numt++;

        }
        return mini;

    }
}