class Solution {
    public int countTestedDevices(int[] bP) {
        int n = bP.length;
        int decrement =0;
        for(int i=0;i<n;i++){
            if(bP[i]-decrement>0){
                decrement++;

            }
        }
        return decrement;
    }
}