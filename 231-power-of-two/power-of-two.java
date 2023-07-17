class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n%2!=0)
        return false;
        if(n%2==0){
            // for(int i=1;i<=n/2;i++){
            //     if(Math.pow(2,i)!=n)
            //     return true; 
            // }
            while(n>2){
                n = n/2;
                if(n%2!=0)
                return false;

            }
            if(n<2)
            return false;

        }
        return true;
    }
}