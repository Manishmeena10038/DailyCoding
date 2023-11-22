class Solution {
    public boolean halvesAreAlike(String s) {
        int count=0;
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                count++;
            }
            if(s.charAt(n-i-1)=='a'||s.charAt(n-i-1)=='e'||s.charAt(n-i-1)=='i'||s.charAt(n-i-1)=='o'||s.charAt(n-i-1)=='u'||s.charAt(n-i-1)=='A'||s.charAt(n-i-1)=='E'||s.charAt(n-i-1)=='I'||s.charAt(n-i-1)=='O'||s.charAt(n-i-1)=='U'){
                count--;
            }

        }
        if(count==0)
        return true;
        return false;
    }
}