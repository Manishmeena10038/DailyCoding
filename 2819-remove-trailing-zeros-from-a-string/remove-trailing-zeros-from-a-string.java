class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length()-1;
        StringBuilder sb = new StringBuilder(num);
        if(num.charAt(n)!='0')
        return num;
        
       while(n>=0){
           if(num.charAt(n)!='0')
           return sb.toString();
           else{
                sb.deleteCharAt(n);
           }
           n--;
           
       }
       return sb.toString();
    }
}