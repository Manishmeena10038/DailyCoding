class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        
        for(int i=0;i<r-1;i++){
            for(int j =0;j<c-1;j++){
                // if(i+i<r&&j+1<c){
                    if(arr[i][j]!=arr[i+1][j+1]){
                        return false;
                    }
                // }
            }
        }
        return true;
    }
}