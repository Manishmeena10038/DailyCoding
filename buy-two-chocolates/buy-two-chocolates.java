class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int prize = money-(prices[0]+prices[1]);
        return prize < 0 ? money : prize;
    }
}