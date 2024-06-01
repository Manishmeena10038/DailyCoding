class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i=1;i<s.length();i++){
            score = score+Math.abs(s.charAt(i-1)-s.charAt(i));
        }
        return score;
    }
}