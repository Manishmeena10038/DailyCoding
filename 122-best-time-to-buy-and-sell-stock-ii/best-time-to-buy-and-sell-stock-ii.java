class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int sum = 0;
        for(int i =1;i<n;i++){
            if(prices[i-1]<prices[i])
                sum+= prices[i]-prices[i-1];
        }
        System.gc();
        return sum;
    }
}