class Solution {
    public double trimMean(int[] arr) {
        int m = (arr.length*5)/100;
        int l = arr.length-2*m;
        Arrays.sort(arr);
        int sum =0;
        for(int i=m;i<arr.length-m;i++){
            sum+=arr[i];     
        }
        return (double)sum/l;      
    }
}
// class Solution {
//     public double trimMean(int[] arr) {    
//         Arrays.sort(arr);
//         int n=arr.length*5/100;
//         int sum=0;
//         int count=0;
//         for(int i=n;i<arr.length-n;i++)
//         {
//             sum+=arr[i];
//             count++;
//         }
//         return (double)sum/count;
//     }
// }