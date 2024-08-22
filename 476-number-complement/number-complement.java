class Solution {
    public int findComplement(int num) {
         int ans = 0;
         int i =0;
        while(num>0){
           int j = num%2;
            num=num/2;
            if(j==0)j=1;
            else j=0;
            ans+=j*Math.pow(2,i);
            i++;
        }
        return ans;
    }
}