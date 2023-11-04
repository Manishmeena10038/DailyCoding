class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        
        // int maxLeft = Arrays.stream(left).max().orElse(0);
        // int minRight = n - Arrays.stream(right).min().orElse(n);
        // return Math.max(maxLeft, minRight);
    int lastmoment = 0;
    for(int t:left){
        lastmoment = Math.max(lastmoment,t);
    }
    for(int t:right){
        lastmoment = Math.max(lastmoment,n-t);
    }
    return lastmoment;
    }
}