class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        while(n>0){
            if(n%2!=0){
                cnt++;
            }
            n=n/2;
        }
        if(n==1) cnt++;
        return cnt;
    }
}