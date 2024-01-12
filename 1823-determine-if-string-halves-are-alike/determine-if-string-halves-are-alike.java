class Solution {
    public boolean halvesAreAlike(String s) {
        int l = s.length();
        int half = l/2;
        int count = 0;
         
        s = s.toLowerCase();
        for(int i=0;i<l;i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            if(i<half) count++;
            else count--;
            }
        }
        return count==0;

    }
}