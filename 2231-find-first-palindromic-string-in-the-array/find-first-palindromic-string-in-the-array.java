class Solution {
    public String firstPalindrome(String[] words) {
     for(String s:words){
         int l= 0;int r = s.length()-1;
         boolean pal = true;
         while(l<=r){
             if(s.charAt(l)!=s.charAt(r)){
                 pal = false;
            }
            r--;
            l++;
         }
         if(pal){
             return s;
         }
     }
     return "";
    }   
}