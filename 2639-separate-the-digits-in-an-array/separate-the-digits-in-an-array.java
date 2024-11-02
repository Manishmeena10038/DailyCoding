class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            ArrayList<Integer> temp = new ArrayList<>();
            while(nums[i]>0){
                int rem = nums[i]%10;
                temp.add(rem);
                nums[i] = nums[i]/10;

            }
            for(int j=temp.size()-1;j>=0;j--){
                arr.add(temp.get(j));
            }
        }

        int ans[] = new int[arr.size()];

        for(int i=0;i<arr.size();i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}