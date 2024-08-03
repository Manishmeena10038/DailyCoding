class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int ans[] = new int[1001];
        for(int i:target){
            ans[i]++;
        }
         for(int i:arr){
            ans[i]--;
        }

        for(int i:ans){
            if(i!=0)return false;
        }
        return true;
    }
}