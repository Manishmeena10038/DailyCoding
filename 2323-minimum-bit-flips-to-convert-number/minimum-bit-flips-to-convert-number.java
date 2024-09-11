class Solution {
    public int minBitFlips(int start, int goal) {
       int n = start^goal;
       int ans =0;
       while(n!=0){
        ans+=n&1;
         n>>=1;
       }
       return ans;
    }
}