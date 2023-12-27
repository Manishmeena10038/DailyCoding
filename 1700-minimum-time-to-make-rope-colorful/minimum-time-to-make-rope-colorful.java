class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum =0;
        int pre =0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(pre)!=colors.charAt(i)){
                pre = i;
                // sum = sum+ Math.min(neededTime[i-1],neededTime[i]);
            }
            else{
                if(neededTime[pre]<neededTime[i]){
                    sum+=neededTime[pre];
                    pre = i;
                }
                else{
                    sum+=neededTime[i];
                }
            }
        }
        return sum;
    }
}