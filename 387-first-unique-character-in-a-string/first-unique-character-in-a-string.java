class Solution {
    public int firstUniqChar(String s) {
        int [] ca = new int[26];
        for(char c:s.toCharArray()){
            ca[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(ca[c-'a']==1) return i;
        }
        return -1;
        
    }
}