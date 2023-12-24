class Solution {
    public int minOperations(String s) {
        int mini = Math.min(first1(s),first0(s));
        return mini;
    }
    static int first1(String a){
        int count =0;
        char d[] = a.toCharArray();
        for(int i=0;i<a.length();i++){
            if(i%2==0){
                if(d[i]!='1') count++;
            }
            else{
                if(d[i]!='0') count++;
            }
        }
        return count;

    }
    static int first0(String a){
        int count =0;
        char d[] = a.toCharArray();
        for(int i=0;i<a.length();i++){
            if(i%2==0){
                if(d[i]!='0') count++;
            }
            else{
                if(d[i]!='1') count++;
            }
        }
        return count;
    }
}