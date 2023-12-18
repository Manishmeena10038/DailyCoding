class Solution {
    public int maxProductDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return (arr[n-1]*arr[n-2])-(arr[0]*arr[1]);
    }
}