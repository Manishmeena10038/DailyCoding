public class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        if (xor == k) {
            return 0;
        }
        //return the no of ones after xor ^ k
        int flips = Integer.bitCount(xor ^ k);
        return flips;
    }
}