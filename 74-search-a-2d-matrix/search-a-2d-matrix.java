class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int n = matrix[0].length;
        int m = matrix.length;
        int rs = 0;
        int cs = 0;
        int re =  m-1;
        int ce = n-1;
        while(rs<=re && cs<=ce){
            for(int i =0;i<n;i++){
                if(matrix[rs][i]==target){
                    return true;
                }
            }
            rs++;
        }
        return false;        
    }
}