class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        int[] arr = new int[n*(n+1)/2];
        int k=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=(sum+nums[j])%mod;
                arr[k++]= sum;
            }
        }
        Arrays.sort(arr);
        int ans = 0;
        for(int i=left;i<=right;i++){
            ans=(ans+arr[i-1])%mod;
        }
        return ans%mod;
    }
}