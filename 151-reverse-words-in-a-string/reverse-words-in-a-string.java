class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder sb = new StringBuilder();
        String[] ans = s.split(" ");

        for(int i=ans.length-1;i>0;i--){
            String  r = ans[i];
            if(!r.trim().equals("")){
                sb.append(r.trim());
                sb.append(' ');

            }

        }
        sb.append(ans[0]);
        return sb.toString();
    }
}