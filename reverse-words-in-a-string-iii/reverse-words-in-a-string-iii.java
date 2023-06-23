class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String[] str = null;
        str = s.split(" ");
        String reverseword = "";
        for(String d : str){
            StringBuilder sb = new StringBuilder(d);
            sb.reverse();
            reverseword= reverseword + sb.toString() +" ";
        }
        return reverseword.substring(0,reverseword.length()-1);
    }
}