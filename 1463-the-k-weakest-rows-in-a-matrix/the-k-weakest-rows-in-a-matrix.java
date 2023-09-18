class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
  int[] r = new int[k];
int[] sums = new int[mat.length];
for (int i = 0; i < mat.length; i++) {
    int sum = 0;
    for (int j = 0; j < mat[i].length; j++) {
        sum += mat[i][j];
    }
    sums[i] = sum;
}

for (int i = 0; i < r.length; i++) {
    int min = sums[0];
    int index = 0;
    for (int j = 0; j < sums.length; j++) {
        if (min > sums[j]) {
            min = sums[j];
            index = j;
        }
    }
    r[i] = index;
    sums[index] = Integer.MAX_VALUE;
}
return r;

    }
}