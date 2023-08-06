class Solution {
  public int numMusicPlaylists(int n, int goal, int k) {
    final int kMod = 1_000_000_007;
    long[][] dp = new long[goal + 1][n + 1];
    dp[0][0] = 1;
    for (int i = 1; i <= goal; ++i)
      for (int j = 1; j <= n; ++j) {
        dp[i][j] += dp[i - 1][j - 1] * (n - (j - 1));  
        dp[i][j] += dp[i - 1][j] * Math.max(0, j - k);
        dp[i][j] %= kMod;
      }
    return (int) dp[goal][n];
  }
}
