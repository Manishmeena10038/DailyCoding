class Solution {
    public String reverseStr(String s, int k) {
        char[] ss = s.toCharArray();
        for(int i=0;i<s.length();i=i+2*k){
            int j=i,l=Math.min(i+k-1,s.length()-1);
            while(j<l){
                char temp=ss[l];
                ss[l]=ss[j];
                ss[j]=temp;
                j++;
                l--;
            }
        }
        return new String(ss); 
    }
}