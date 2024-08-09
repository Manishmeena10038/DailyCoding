class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

    //     int ans = findways(grid,n,m,0,0);
    //     return ans;
    // }
    // public static int findways(int[][] grid, int n, int m, int curx, int cury){
    //     if(curx>=n||cury>=m||grid[curx][cury]==1)return 0;
    //     if(curx==n-1&&cury==m-1)return 1;

    //     return findways(grid,n,m,curx+1,cury)+findways(grid,n,m,curx,cury+1);

    int dp[] = new int[m];
    dp[0]=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                dp[j]=0;
            }
            else if(j>0){
                dp[j]+=dp[j-1];
            }
        }
       
    }
     return dp[m-1];
    }
}