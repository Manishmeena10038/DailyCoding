class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       

        Arrays.sort(intervals, Comparator.comparingInt(a->a[1]));
        int end = intervals[0][1];
        int ans = 0;
        for(int i=1;i<intervals.length;i++){
           int start = intervals[i][0];
           if(start<end){
               ans++;
           }
           else{
               end = intervals[i][1]; 
           }
        }
        return ans;
    }
}