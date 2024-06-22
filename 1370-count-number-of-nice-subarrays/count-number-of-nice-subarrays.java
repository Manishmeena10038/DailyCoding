class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int cnt =0;
        int ans =0;

      
        HashMap<Integer,Integer> map =  new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            if((nums[i]%2!=0)) cnt++;
            int dif = cnt-k;
            ans+=map.getOrDefault(dif,0);
            map.put(cnt,map.getOrDefault(cnt,0)+1);

            
        }
        return ans;
    }
}