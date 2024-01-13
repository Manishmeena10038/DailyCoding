class Solution {
    public int minSteps(String s, String t) {
        int[] chararray = new int[26];
        for(char c:s.toCharArray()){
            chararray[c-'a']++;
        }
        for(char c:t.toCharArray()){
            chararray[c-'a']--;
        }
        int sum=0;
        for(int i:chararray){
            sum+=Math.abs(i);
        }
        return sum/2;

        
    }
}