import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> output = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 1) {
                    int[] arr = {i, j, i, j};
                    farmer(i, j, arr, land);
                    output.add(arr);
                }
            }
        }
        int[][] result = new int[output.size()][4];
        for (int i = 0; i < output.size(); i++) {
            result[i] = output.get(i);
        }
        return result;
    }

    private void farmer(int i, int j, int[] arr, int[][] land) {
        if (i < 0 || j < 0 || i > land.length - 1 || j > land[0].length - 1 || land[i][j] != 1) return;
        land[i][j] = 0;
        if (i < arr[0]) {
            arr[0] = i;
        }
        if (j < arr[1]) {
            arr[1] = j;
        }
        if (i > arr[2]) {
            arr[2] = i;
        }
        if (j > arr[3]) {
            arr[3] = j;
        }
        farmer(i + 1, j, arr, land);
        farmer(i - 1, j, arr, land);
        farmer(i, j + 1, arr, land);
        farmer(i, j - 1, arr, land);
    }
}