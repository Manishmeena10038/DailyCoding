class Solution {
    public int reverse(int x) {
        int sign =1;
        if(x<0) sign =-1;
        long rev =0;
        int re=0;
        x = x*sign;

        while(x>0){
            int r=x%10;
            rev = rev*10+r;
            re = re*10+r;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE)return 0;
        return sign*re;
    }
}