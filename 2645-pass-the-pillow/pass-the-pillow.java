class Solution {
    public int passThePillow(int n, int time) {
        if(time/(n-1)==1&&time%(n-1)==0) return n;
        if(time/(n-1)<1)return time+1;
        int l = time/(n-1);
        int r = time%(n-1);
        if(l%2==0){
            return r+1;
        }
        return n-r;
    }
}