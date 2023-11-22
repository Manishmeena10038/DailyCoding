class Solution {
    public int percentageLetter(String s, char letter) {
        int a = s.length();
        int count =0;
        for(char c:s.toCharArray()){
            if(c==letter){
                count++;
            }
        }
        int p = (count*100)/a;
        return p;
    }
}