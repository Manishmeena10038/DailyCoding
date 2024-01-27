class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> f = new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                f.add(i);
            }
        }
        return f;
    }
}