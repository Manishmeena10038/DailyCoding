class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] ar = new int[52];
        int cnt = 0;
        for (char c : jewels.toCharArray()) {
            if (Character.isLowerCase(c)) {
                ar[c - 'a'] = 1;
            } else if (Character.isUpperCase(c)) {
                ar[c - 'A' + 26] = 1;
            }
        }
        for (char c : stones.toCharArray()) {
            if (Character.isLowerCase(c) && ar[c - 'a'] == 1) {
                cnt++;
            } else if (Character.isUpperCase(c) && ar[c - 'A' + 26] == 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
