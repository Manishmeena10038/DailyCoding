class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(int i=1;i<=nums.length;i++){
        //     if(map.containsKey(i))
        //     if(map.get(i)>1){
        //         l.add(i);
        //     }
        // }
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(arr[nums[i]-1]!=0){
                l.add(arr[nums[i]-1]);
            }
            arr[nums[i]-1] = nums[i];
        }
        return l;
    }
}