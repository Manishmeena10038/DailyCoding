class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> subset = new ArrayList<>();
         subset.add(new ArrayList<>());
         for(int i = 0; i < nums.length; i++) {
             int size = subset.size();
             for(int j = 0; j < size; j++) {
                 List<Integer> list = new ArrayList<>(subset.get(j));
                 list.add(nums[i]);
                 subset.add(list);
             }
         }
         return subset;
      
    }
}