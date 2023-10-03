import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int value : count.values()) {
            ans += (value * (value - 1)) / 2;
        }

        return ans;
    }
}
