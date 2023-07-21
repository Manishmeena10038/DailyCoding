class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a->a[1]));
        int burst = 1;
        int end = points[0][1];
        for(int i=1;i<points.length;i++){
            int start = points[i][0];
            if(start>end){
                burst++;
                end = points[i][1];
            }
        }
        return burst;
        
    }
}