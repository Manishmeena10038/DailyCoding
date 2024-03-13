class Solution {
    public int pivotInteger(int n) {
        long sum = n*(n+1)/2;
        int l =1;
        int r =n;
        int sum1=0;
        int sum2=0;
        while(sum1+l<sum/2){
            sum1+=l;
            l++;
        }
        while(sum2+r<sum/2){
            sum2+=r;
            r--;
        }

        if(sum-(sum1+sum2)==l&&l==r&&sum1==sum2){
            return r;
        }
        return -1;
    }
}