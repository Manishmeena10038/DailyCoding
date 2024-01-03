class Solution {
    public boolean isPalindrome(String s) {
        String r = s.replaceAll("[^a-zA-Z0-9]", "");
        r=r.toLowerCase();
        int n = r.length();
        for(int i=0;i<n/2;i++){
            if(r.charAt(i)!=r.charAt(n-i-1)) return false;
        }
        return true;
    }
}