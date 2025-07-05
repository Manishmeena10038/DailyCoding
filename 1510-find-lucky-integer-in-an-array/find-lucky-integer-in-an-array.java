class Solution {
    public int findLucky(int[] arr) {
        int nums[] = new int[501];
        for(int i=0;i<arr.length;i++){
            nums[arr[i]]++;
        }
        for(int i=500;i>0;i--){
            if(i==nums[i]){
                return i;
            }
        }
        return -1;
        
    }
}