class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt =0;
        int sum = 0;
        map.put(0,1);
        for(int i:nums){
            sum = sum+i;
            int rem = sum-k;
            if(map.containsKey(rem))
            cnt+=map.get(rem);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}