public class Solution {
    public int removeElement(int[] nums, int val) {
        int s = 0;
        int e = nums.length -1;
        while (s <= e) {
            if (nums[s] != val) {
                s++;
                continue;
            }
            if (nums[e] == val) {
                e --;
                continue;
            }
            nums[s] = nums[e];
            s ++;
            e--;
        }
        return s;
    }
}
