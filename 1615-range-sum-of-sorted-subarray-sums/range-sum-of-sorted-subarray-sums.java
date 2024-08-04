class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=(sum+nums[j])%mod;
                arr.add(sum);
            }
        }
        Collections.sort(arr);
        int ans = 0;
        for(int i=left;i<=right;i++){
            ans=(ans+arr.get(i-1))%mod;
        }
        return ans%mod;
    }
}