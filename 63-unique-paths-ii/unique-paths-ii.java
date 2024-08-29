class Solution {
    public int uniquePathsWithObstacles(int[][] Grid) {
        int n =  Grid.length;
        int m = Grid[0].length;
        int dp[] = new int[m];

        dp[0] = 1;


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(Grid[i][j]==1){
                    dp[j] = 0;
                }
                else if(j>0){
                    dp[j]+=dp[j-1];
                }
            }
        }
        return dp[m-1];
    }
}