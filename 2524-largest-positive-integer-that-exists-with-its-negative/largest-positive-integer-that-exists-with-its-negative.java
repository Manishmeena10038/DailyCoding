class Solution {
    public int findMaxK(int[] nums) {
        int max = -1;
        HashSet<Integer> set =  new  HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(!set.contains(-nums[i])){
                set.add(nums[i]);
            }
            else{
                max = Math.max(max,Math.abs(nums[i]));
                
            }
        }
        return max;
    }
}