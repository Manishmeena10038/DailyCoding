class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        for(int i =0;i<arr.length;i++){
            arr[i] = heights[i];
        }
        Arrays.sort(arr);
       
       int cnt = 0;
       for(int i =0;i<arr.length;i++){
        if(arr[i]!=heights[i]){
            cnt++;
        }
       }
       return cnt;
    }
}