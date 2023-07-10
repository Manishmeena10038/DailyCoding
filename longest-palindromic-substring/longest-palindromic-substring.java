public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        
        String res = "";
        for (int i = 0; i < s.length() - 1; i++) {
            String str1 = getPalin(s, i, i);
            String str2 = getPalin(s, i, i + 1);
            if (str1.length() > res.length()) {
                res = str1;
            }
            if (str2.length() > res.length()) {
                res = str2;
            }
        }
        
        return res;
    }
    
    private String getPalin(String s, int l , int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}