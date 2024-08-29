class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int ans=0;
        for(int i=0;i<=grid.length-3;i++){
            for(int j=0;j<=grid[0].length-3;j++){
                if(dis(grid,i,j)&&sum(grid,i,j)){
                    ans++;
                }
            }
        }
        return ans;

    }
    public static boolean dis(int[][] grid, int i,int j){
        int arr[] = new int[10];
        for(int k=i;k<i+3;k++){
            for(int l=j;l<j+3;l++){
                if(grid[k][l]==0||grid[k][l]>9){
                    return false;
                }
                else{
                    arr[grid[k][l]]++;
                    if(arr[grid[k][l]]>1)return false;
                }
            }
        }
        return true;
    }
    public static boolean sum(int[][] grid, int i,int j){
        
        int sumd1 = grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
        int sumd2 = grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j];
        int sumr1 = grid[i][j]+grid[i][j+1]+grid[i][j+2];
        int sumr2 = grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2];
        int sumr3 = grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];

        int sumc1 = grid[i][j]+grid[i+1][j]+grid[i+2][j];
        int sumc2 = grid[i][j+1]+grid[i+1][j+1]+grid[i+2][j+1];
        int sumc3 = grid[i][j+2]+grid[i+1][j+2]+grid[i+2][j+2];

        if(sumr1!=sumr2||sumr2!=sumr3||sumr3!=sumd1||sumd1!=sumd2||sumd2!=sumc1||sumc1!=sumc2||sumc2!=sumc3){
            return false;
        }
        return true;

    }
}