class Solution {
    public String reverseWords(String s) {
        
        String k[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        for(int i=0;i<k.length;i++){
            if(k[i].isEmpty()){
                continue;
            }
            else{
                st.push(k[i]);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}