class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int fre[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]&&i!=j){
                    cnt++;
                }
            }
            fre[i] = cnt;
        }
        return fre;

    }
}