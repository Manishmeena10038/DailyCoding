class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right=0;
        int max =0;
        Set<Character> s1 = new HashSet<>();
        while(right<s.length()){
            char c = s.charAt(right);
            if(s1.add(c)){
                right++;
                max = Math.max(max,right-left);
            }
            else{
                while(s.charAt(left)!=c){
                    s1.remove(s.charAt(left));
                    left++;
                }
                s1.remove(c); left++;
            }
        }
        return max;
    }
}