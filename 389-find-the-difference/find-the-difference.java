class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            ans ^= c;
        }

        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            ans ^= c;
        }

        return ans;
    }
}