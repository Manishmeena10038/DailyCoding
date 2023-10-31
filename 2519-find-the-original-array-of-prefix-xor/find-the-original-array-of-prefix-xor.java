class Solution {
    public int[] findArray(int[] pref) {
        int arr[] = new int[pref.length];
        for(int i =pref.length-1;i>0;i--){
            arr[i] = pref[i]^pref[i-1];
        }
        arr[0]=pref[0];
        return arr;
    }
}