class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int fsum = 0;
        int c = 0;
        map.put(0, 1); 
        for(int i : nums) {
            fsum += i;
            int csum = fsum - goal;
            if(map.containsKey(csum)) {
                c += map.get(csum);
            }
            map.put(fsum, map.getOrDefault(fsum, 0) + 1);
        }
        return c;
    }
}
