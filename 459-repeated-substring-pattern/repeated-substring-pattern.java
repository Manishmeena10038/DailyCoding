public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        for (int i = 1; i <= str.length() / 2; i ++) {
            if (str.length() % i == 0) {
                if (str.substring(0, str.length() - i).equals(str.substring(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}