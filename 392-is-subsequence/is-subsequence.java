class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0;
        int y = s.length();
        int z = t.length();
        int j =0;
        boolean b = false;
        String g = "";
        String v = "";
        int count = 0;
        while(i<y && j<z){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                // j++;
                ++count;
            }
           j++;
        }
        if(count==y){
            b = true;
        }
        return b;

    }
}