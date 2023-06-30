class Solution {
    public int mySqrt(int x) {
        double temp;
        double sqrt = x/2;
        if(x==0 || x==1){
            return x;
        }
        do{
            temp = sqrt;
            sqrt = (temp+(x/temp))/2;

        }while((temp-sqrt)!=0);
        int sqr = (int)sqrt;
        return sqr;
        
    }
}