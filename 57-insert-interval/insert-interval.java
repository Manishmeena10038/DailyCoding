class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int r = intervals.length;
        int[][] arr = new int[r+1][2];
        for(int i=0;i<2;i++){
            for(int j =0;j<r;j++){
                arr[j][i]=intervals[j][i];
            }
        }
        arr[r][0] = newInterval[0];
        arr[r][1]=newInterval[1];
        return merge(arr); 
    }
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        for(int[] interval:intervals){
            if(ans.isEmpty()||ans.get(ans.size()-1)[1]<interval[0]){
                ans.add(interval);
            }
            else{
                ans.get(ans.size()-1)[1] = Math.max( ans.get(ans.size()-1)[1] ,interval[1]);
            }
        }
        return ans.stream().toArray(int[] [] ::new);
    }
}