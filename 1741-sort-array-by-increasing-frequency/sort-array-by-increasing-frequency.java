class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        //custom sort

        return Arrays.stream(nums).boxed().sorted((a,b) -> map.get(a)!=map.get(b)?map.get(a)-map.get(b):b-a)
        .mapToInt(n -> n).toArray();
    }
}