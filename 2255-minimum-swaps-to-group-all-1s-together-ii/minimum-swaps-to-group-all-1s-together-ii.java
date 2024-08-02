class Solution {
    public int minSwaps(int[] nums) {
        int arr[] = new int[2*nums.length];
        int maxone=0;
        int i =0;
        int ones = 0;
        for(int j:nums){
            arr[i++] = j;
            if(j==1)ones++;
        }
        for(int j:nums){
            arr[i++] = j;
        }
        int one = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int k=0;k<arr.length;k++){
            if(arr[k]==1){
                one++;
            }
            map.put(k,one);
        }

        int left = 0;
        int right = ones;
        while(right<arr.length){
            int curone = map.get(right)-map.get(left);
            maxone = Math.max(maxone,curone);
            right++;
            left++;

        }
        return ones-maxone;
        
    }
}