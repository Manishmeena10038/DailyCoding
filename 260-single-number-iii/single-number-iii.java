class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2) return nums;
        int[] ans = new int[2];
        int j=0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:nums){
            if(map.get(i)==1){
                ans[j++] = i;
            }
        }
        return ans;
    }
 }