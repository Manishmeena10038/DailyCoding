class Solution {
    public int secondHighest(String s) {
        int l = -1;
        int sl = -1;

        for(char c: s.toCharArray()){
            int n = c-'0';
            if(n>=0&&n<10){
                if(n>l){
                    sl = l;
                    l = n;

                }
                else if(n>sl&&n<l){
                    sl = n;
                }

            }
        }
        return sl;
    }
}