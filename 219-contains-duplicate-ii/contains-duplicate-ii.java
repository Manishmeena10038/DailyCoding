class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Boolean b = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if((i-map.get(nums[i]))<=k) b = true;
            }
            map.put(nums[i],i);
        }
        return b;
    }
}