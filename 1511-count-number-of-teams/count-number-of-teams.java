class Solution {
    public int numTeams(int[] rating) {
        int cnt=0;
        for(int i=1;i<rating.length;i++){
           int ll = 0, lg=0;
           int rl=0,rg=0;

           for(int j=0;j<i;j++){
            if(rating[j]<rating[i]){
                ll++;
            }
            if(rating[j]>rating[i]){
                lg++;
            }
           }


           for(int j=i+1;j<rating.length;j++){
            if(rating[j]<rating[i]){
                rl++;
            }
            if(rating[j]>rating[i]){
                rg++;
            }
           }
           cnt+= (rg*ll)+(lg*rl);
        }
        return cnt;
    }
}