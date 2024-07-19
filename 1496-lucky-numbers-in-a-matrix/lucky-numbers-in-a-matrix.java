class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       HashSet<Integer> set = new HashSet<>();
       ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int minr = matrix[i][0];
            for(int j=0;j<matrix[0].length;j++){
                minr = Math.min(minr,matrix[i][j]);
            }
            set.add(minr);
        }
        for(int i=0;i<matrix[0].length;i++){
            int maxc = matrix[0][i];
            for(int j=0;j<matrix.length;j++){
                maxc = Math.max(maxc,matrix[j][i]);
            }
            if(set.contains(maxc)){
                ans.add(maxc);
            }
        }
        return ans;
    }
}