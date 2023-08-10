class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        int m = (n*5)/100;
        int l = n-2*m;
        double s =0;
        Arrays.sort(arr);
        double sum =0;
        for(int i=m;i<arr.length-m;i++){
            sum+=arr[i];
            s++;
        }
       double avg = sum/s;
        return avg;      
    }
}