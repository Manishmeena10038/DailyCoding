class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> al = new ArrayList<Integer>();
        int[] ret = new int[n];
        for(int i=0;i<n;i++)
            al.add(index[i],nums[i]);
        for (int i = 0; i < al.size(); i++)
            ret[i] = al.get(i);
        return ret;        
    }
}