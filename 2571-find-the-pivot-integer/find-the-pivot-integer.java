class Solution {
    public int pivotInteger(int n) {
        int sum =0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
       int temp =0;
       for(int i=1;i<=n;i++){
           sum = sum-i;
           if(sum!=temp){
               temp+=i;
           }
           else
           return i;
       }
       return -1;
    }
}