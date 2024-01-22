class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];

        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i =0;i<n;i++){
            if(m.containsKey(nums[i])) ans[0] = nums[i];
            m.put(nums[i],1);
        }
        int sum = n*(n+1)/2;
        for(int i:nums){
            sum-=i;
        }
        ans[1] = sum+ans[0];
        return ans;
    }
}