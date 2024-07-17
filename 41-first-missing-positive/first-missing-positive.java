class Solution {
    public int firstMissingPositive(int[] nums) {
       int max = 0;
       HashSet<Integer> set = new HashSet<>();
       for(int i:nums){
        max = Math.max(i,max);
       }
       if(max==0) return 1;
      
       for(int i:nums){
        if(i>0){
            set.add(i);
        }
       }
       for(int i=1;i<=max;i++){
        if(!set.contains(i))return i;
       }
       
       return max+1;

    }
}