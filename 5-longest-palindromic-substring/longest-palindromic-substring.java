class Solution {
    int st, e;
    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++) {
            solve(i,i,s);
            solve(i,i+1,s);
        }

        return s.substring(st,e);
    }


    public void solve(int l, int r, String s) {
        while(l>=0 && r<s.length()){
            if(s.charAt(l) != s.charAt(r)) break;
            l--;
            r++;
        }

        if((e-st) < (r-l-1)) {
            st = l+1;
            e = r;
        }

    }
}  