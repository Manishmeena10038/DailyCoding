class Solution {
    public boolean check(int[] arr) {
       int n = arr.length;
       int cnt =0;
       for(int i=0;i<n;i++){
           if(arr[i]>arr[(i+1)%n])cnt++;
       }
       return cnt<=1;
    }
}