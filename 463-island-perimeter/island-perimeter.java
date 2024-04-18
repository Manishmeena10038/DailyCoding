class Solution {
    public int islandPerimeter(int[][] grid) {
        int nb = 0;
        int isl = 0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    isl++;
                    if(i-1>=0&&grid[i-1][j]==1){
                        nb++;
                    }
                    if(j-1>=0&&grid[i][j-1]==1){
                        nb++;
                    }
                }
            }
        }
        return 4*isl-2*nb;
    }
}