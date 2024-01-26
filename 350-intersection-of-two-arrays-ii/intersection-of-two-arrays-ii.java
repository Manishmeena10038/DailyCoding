class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        int low=0;
        int high = 0;
        int n=nums1.length;
        int m = nums2.length;
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            if(map.containsKey(i)&&map.get(i)>0){
                ar.add(i);
                map.put(i,map.getOrDefault(i,0)-1);
            }
        }
         return ar.stream().mapToInt(Integer::intValue).toArray();
    }
}