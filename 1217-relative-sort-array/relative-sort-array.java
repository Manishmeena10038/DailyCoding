class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[1001];
        int[] result = new int[arr1.length];

        for(int i:arr1){
            arr[i]++;
        }
        int i =0;
        for(int num:arr2){
            while(arr[num]-->0){
                result[i++] = num;
            }
        }
        for(int k=0;k<1001;k++){
            while(arr[k]-->0){
                result[i++]= k;
            }
        }
        return result;
    }
}