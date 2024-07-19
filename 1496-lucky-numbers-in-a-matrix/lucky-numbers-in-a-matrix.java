class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       ArrayList<Integer> arr = new ArrayList<>();
       for(int i=0;i<matrix.length;i++){
        int col = findmin(matrix,i);
        int maxcol = matrix[i][col];
        if(maxcol(matrix,maxcol,col)){
        arr.add(maxcol);
       }
       }

       
       return arr;
    }
    public static int findmin(int[][] matrix,int i){
        int min = matrix[i][0];
        int col = 0;
        for(int j=0;j<matrix[i].length;j++){
            if(min>matrix[i][j]){
                min = matrix[i][j];
                col = j;
            }
        }
        return col;
    }
    public static boolean maxcol(int[][] matrix , int max, int col ){
        for(int i=0;i<matrix.length;i++){
            if(max<matrix[i][col]){
                return false;
            }
        }
        return true;
    }
}

// class Solution {
//     public List<Integer> luckyNumbers (int[][] matrix) {
//         List<Integer> lsRes = new ArrayList<>();

//         for(int i = 0; i < matrix.length; i++)
//         {
//             int col = findMin(matrix, i);

//             int maxCol = matrix[i][col];
//             if(maxInCol(matrix, maxCol, col))
//                 lsRes.add(maxCol);
//             // for(int r = 0; r < matrix.length; r++)
//             // {
//             //     if(matrix[r][col] > maxCol)
//             //         maxCol = matrix[r][col];
//             // }

//             // if(minRow == maxCol)
//             //     lsRes.add(matrix[i][col]);
//         }

//         return lsRes;
//     }
//     private int findMin(int[][] matrix, int row){
// 		int val= matrix[row][0], col=0;
// 		for(int i=1;i<matrix[row].length;i++){
// 			if(matrix[row][i]<val){
// 				val=matrix[row][i];
// 				col=i;
// 			}
// 		}
// 		return col;
// 	}
//     private boolean maxInCol(int[][] matrix, int val, int col){
//         for(int i=0;i<matrix.length;i++){
//             if(matrix[i][col]>val)
//                 return false;
//         }
//         return true;
//     }
// }