class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        char[] arr = s.toCharArray();
        int i = -1;
        int prev = -10000;
        
        for(int j = 0; j<n; j++){
            while(arr[j] == c && i<j){
                i++;
                ans[i] = Math.min(Math.abs(i-prev), Math.abs(j-i));

                if(i == j){
                    prev = j;
                }
            }
        }

        for(; i<n; i++){
            ans[i] = Math.abs(i-prev);
        }

        return ans;
    }
}