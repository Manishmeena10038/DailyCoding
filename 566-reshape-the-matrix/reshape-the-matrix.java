class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n  = mat.length;
        int m = mat[0].length;

        if(m*n!=r*c) return mat;

        int ans[][] = new int[r][c];

        int rr =0;
        int cc =0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[rr][cc++] = mat[i][j];
                if(cc==c){
                    cc=0;
                    rr++;
                }
            }
        }
        return ans;
    }
}