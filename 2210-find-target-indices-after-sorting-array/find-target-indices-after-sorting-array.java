class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> arli = new ArrayList<Integer>();
        Arrays.sort(nums);

        int low=0;
        int high = nums.length-1;
        for(int i=0;i<=high;i++){
            if(nums[i]==target){
                arli.add(i);
            }
        }
        return arli;
    }
}