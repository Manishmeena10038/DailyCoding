class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l = word1.length();
        int m = word2.length();
        int n = Math.min(l,m);
        int i=0;
        while(i<n){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        if(i<l){
            sb.append(word1.substring(i,l));
        }
        else{
            sb.append(word2.substring(i,m));
        }
        return sb.toString();
    }
}