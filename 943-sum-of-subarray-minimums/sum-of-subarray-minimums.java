class Solution {
    public static final int MOD = 1_000_000_007;

    public int sumSubarrayMins(int[] arr) {
        long sumOfMin = 0;

        for(int i = 0; i < arr.length; i++){
            sumOfMin = (sumOfMin + findSubArrayMin(arr, i)) % MOD;
        }
        return (int)sumOfMin;
    }

    public static int findSubArrayMin(int[] arr, int start){
        int minVal = arr[start];
        int result = 0;

        for(int i = start; i < arr.length; i++){
            minVal = Math.min(minVal, arr[i]);
            result += minVal;
        }
        return result;
    }
}

