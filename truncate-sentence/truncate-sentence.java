class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String[] r = new String[k];
        
        for(int i =0;i<k;i++){
            r[i] = words[i];

        }
        StringBuilder builder = new StringBuilder();
for(String l : r) {
    builder.append(l+" ");
}
String str = builder.toString();
 String  st = str.substring(0, str.length() - 1);
        return st;
    }
}