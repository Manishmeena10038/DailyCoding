class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        long sum = 0;

        
        Arrays.sort(happiness);
        for (int i = 0; i < k; i++) {
            int sum1 = Math.max(0,happiness[n - 1 - i]-i);
            
            sum += sum1; 
        }

        return sum;
    }
}

