class Solution {
    public int findMiddleIndex(int[] nums) {
         int[] sumleft = new int[nums.length];
    int[] sumright = new int[nums.length];
    int l = 0;
    int sum1 = 0;
    int sum2 = 0;
    while(l<nums.length){
        for(int i=0;i<l;i++){
            sum1+=nums[i];
        }
        for(int i =nums.length-1;i>l;i--){
            sum2+=nums[i];
        }
        sumleft[l]=sum1;
        sumright[l]=sum2; 
        sum1 = 0;
        sum2 = 0;
        if(sumleft[l]==sumright[l])
        return l;
        l++;
    }
    return -1;

    }
}