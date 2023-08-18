class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] cityRank = new int[n];
        boolean[][] isConnected = new boolean[n][n];
        
        // Count the number of roads connected to each city
        for (int[] road : roads) {
            int city1 = road[0];
            int city2 = road[1];
            cityRank[city1]++;
            cityRank[city2]++;
            isConnected[city1][city2] = true;
            isConnected[city2][city1] = true;
        }
        
        int maxRank = 0;
        
        // Calculate the maximal network rank by considering all pairs of cities
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int rank = cityRank[i] + cityRank[j];
                if (isConnected[i][j]) {
                    rank--; // Subtract one for the duplicate road
                }
                maxRank = Math.max(maxRank, rank);
            }
        }
        
        return maxRank;
    }
}
