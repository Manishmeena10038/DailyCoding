class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxf = 1;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            maxf=Math.max(maxf,freq[nums[i]]);
        }
        int mxf=0;
        for(int i=0;i<101;i++){
            if(freq[i]==maxf){
                mxf+=maxf;
            }
        }
        return mxf;

    }
}