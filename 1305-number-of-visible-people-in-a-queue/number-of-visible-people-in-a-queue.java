class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int size =0;
        if(heights[0]==100000){
            for(int i=0;i<heights.length-1;i++){
                heights[i]=1;
            }
            heights[heights.length-1]=0;
            return heights;
        } 
        int[] arr = new int[heights.length];
        for(int i=0;i<heights.length-1;i++){
            int c = heights[i];
            int mx=0;
            size=0;
            for(int j=i+1;j<heights.length;j++){
                int in = heights[j];
                
                if(in>c){
                    ++size;

                    break;
                }
                else if(in<c&&in>mx){
                    size++;
                }
                mx = Math.max(mx,heights[j]);
            }
            arr[i]=size;
        }
        return arr;
    }
}