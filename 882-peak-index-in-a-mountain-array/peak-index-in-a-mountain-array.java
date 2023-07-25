class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int aarambh = 0;
        int ant = arr.length-1;
        while(aarambh<ant){
            int madhya = ( aarambh+ant)/2;
            if(arr[madhya]<arr[madhya+1])
                aarambh = madhya+1;
            else
                ant = madhya;
            madhya = ( aarambh+ant)/2;
        }
        return ant;       
    }
}








// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int i =0;
//         while(arr[i]<arr[i+1]){
//             i++;
//         }
//         return i;
        
//     }
// }