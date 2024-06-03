class Solution {
    public int appendCharacters(String s, String t) {
        int ls =0;
        int ts =0;
        while(ls<s.length()&&ts<t.length()){
            if(s.charAt(ls)==t.charAt(ts)){
                ts++;ls++;
            }
            else ls++;
        }
        return t.length()-ts;
    }
}