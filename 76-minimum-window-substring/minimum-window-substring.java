import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int requiredChars = t.length();
        int low = 0;
        int high = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (high < s.length()) {
            char currentChar = s.charAt(high);

            if (targetMap.containsKey(currentChar)) {
                if (targetMap.get(currentChar) > 0) {
                    requiredChars--;
                }
                targetMap.put(currentChar, targetMap.get(currentChar) - 1);
            }

            while (requiredChars == 0) {
                if (high - low + 1 < minLen) {
                    minLen = high - low + 1;
                    minStart = low;
                }

                char startChar = s.charAt(low);

                if (targetMap.containsKey(startChar)) {
                    targetMap.put(startChar, targetMap.get(startChar) + 1);
                    if (targetMap.get(startChar) > 0) {
                        requiredChars++;
                    }
                }

                low++;
            }

            high++;
        }

        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(minStart, minStart + minLen);
    }
}
