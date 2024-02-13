class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            String r = rev(s);
            if(r.equals(s)) return s;
        }
         
        return "";
    }
    static String rev(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}