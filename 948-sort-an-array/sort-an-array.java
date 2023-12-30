class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
        for(int i=0;i<nums.length;i++){
            pr.add(nums[i]);
        }
        int i=0;
        while(!pr.isEmpty()){
            nums[i++] = pr.poll();
        }
        return nums;
    }
}