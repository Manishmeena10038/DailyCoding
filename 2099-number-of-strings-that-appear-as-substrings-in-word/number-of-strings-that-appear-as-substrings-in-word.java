class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int cnt=0;
        for(String pattern:patterns){
            if(word.contains(pattern)){
                cnt++;
            }
        }
        return cnt;
    }
}