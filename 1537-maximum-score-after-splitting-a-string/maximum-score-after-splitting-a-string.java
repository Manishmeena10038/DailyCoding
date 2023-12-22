class Solution {
    public int maxScore(String s) {
        int maxi=0;
        int k = s.length();
        if(k==1) return 1;
        if(k==2){
            if(s.charAt(0)==s.charAt(1)) return 1;
            else{
                if(s.charAt(0)=='0') return 2;
                if(s.charAt(0)=='1') return 0;
            }
        }
       for(int i=0;i<k-1;i++){
           int l = zero(s.substring(0,i+1));
           int m = one(s.substring((i+1),k));
           maxi = Math.max(maxi,m+l);
       }
       return maxi;
    }
     static int zero(String b){
            int count =0;
            char c[] = b.toCharArray();
            for(int i=0;i<c.length;i++){
                if(c[i]=='0') count++;
            }
            return count;
        }
        static int one(String m){
            int cnt =0;
            char d[] =  m.toCharArray();
            for(int i=0;i<d.length;i++){
                if(d[i]=='1') cnt++;
            }
            return cnt;
        }
}