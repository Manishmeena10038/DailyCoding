class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();

         for(int i=0;i<n;i++){
             if(i!=0&&nums[i]==nums[i-1]) continue;
             for(int j=i+1;j<n;j++){
                 if(j!=i+1&&nums[j]==nums[j-1]) continue;
                 int l = j+1;
                 int r = n-1;
                 while(l<r){
                     long sum = nums[i];
                     sum+=nums[j];
                     sum+=nums[l];
                     sum+=nums[r];
                     if(sum==target){
                         List<Integer> ans = Arrays.asList(nums[i],nums[j],nums[l],nums[r]);
                         arr.add(ans);
                         l++;
                         r--;
                          while (l < r && nums[l] == nums[l - 1]) l++;
                     while (l < r && nums[r] == nums[r + 1]) r--;
                     }
                     else if(sum<target){
                         l++;
                     }
                     else{
                         r--;
                     }
                    
                 }
             }

         }
         return arr;
    }
}