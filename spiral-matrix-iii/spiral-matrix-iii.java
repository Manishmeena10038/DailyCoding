class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int count=0,ci=1,ri=1,rd=2,cd=2,a=rStart,b=cStart;
        int[][] ans = new int[rows*cols][2];
        ans[count][0]=rStart;
        ans[count][1]=cStart;
        count++;
        while(count<rows*cols){
            for(int i =0;i<ci;i++){
                b++;
                if(a>-1&&b>-1&&a<rows&&b<cols){
                ans[count][0]=a;
                ans[count][1]=b;
                count++;
                }
            }
            ci+=2;
            for(int i =0;i<ri;i++){
                a++;
                if(a>-1&&b>-1&&a<rows&&b<cols){
                    ans[count][0]=a;
                ans[count][1]=b;
                count++;
                }
            }
            ri+=2;
            for(int i =0;i<cd;i++){
                b--;
                if(a>-1&&b>-1&&a<rows&&b<cols){
               ans[count][0]=a;
                ans[count][1]=b;
                count++;
                }
            }
            cd+=2;
            for(int i =0;i<rd;i++){
                a--;
                if(a>-1&&b>-1&&a<rows&&b<cols){
                    ans[count][0]=a;
                ans[count][1]=b;
                count++;
                }
            }
            rd+=2;
        }
        return ans;

    }
}