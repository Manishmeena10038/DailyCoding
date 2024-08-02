class Solution {
    public int minSwaps(int[] nums) {
        // int arr[] = new int[2*nums.length];
        int maxone=0;
        int i =0;
        int ones = 0;
        int one = 0;
        int k=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int j:nums){
            if(j==1){
                one++;
                ones++;
            }
            map.put(k,one);
            k++;
        }
        for(int j:nums){
            if(j==1){
                one++;
                
            }
            map.put(k,one);
            k++;
        }

        
       

        int left = 0;
        int right = ones;
        while(right<k){
            int curone = map.get(right)-map.get(left);
            maxone = Math.max(maxone,curone);
            right++;
            left++;

        }
        return ones-maxone;
        
    }
}