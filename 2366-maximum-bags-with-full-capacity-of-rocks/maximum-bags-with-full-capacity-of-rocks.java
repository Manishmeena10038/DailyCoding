class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int ans = 0;
        int diff[] = new int[rocks.length];
        for(int i =0;i<rocks.length;i++){
            diff[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(diff);

        for(int i=0;i<rocks.length;i++){
            if(diff[i]==0)continue;
            else if(diff[i]<=additionalRocks){
                additionalRocks-=diff[i];
                diff[i]=0;
            }
            else
            break;
        }

        for(int i=0;i<diff.length;i++){
            if(diff[i]==0){
                ans++;
            }
        }
        return ans;
    }
} 