class Solution {
    public int minimumDeletions(String s) {
        int ans =0;
        int cb =0;

        for(char c: s.toCharArray()){
            if(c=='b') cb++;
            else{
                ans = Math.min(ans+1,cb);
            }
        }
        return ans;


    }
}