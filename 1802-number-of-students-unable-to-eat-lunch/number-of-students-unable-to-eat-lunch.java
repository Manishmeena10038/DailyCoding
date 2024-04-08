class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] cnt = new int[2];
        for(int student :students){
            cnt[student]++;
        }
        int ans =sandwiches.length;
        for(int sd:sandwiches){
            if(cnt[sd]==0)break;
            if(ans--==0){
                break;
            }
            cnt[sd]--;
            // ans--;
        }
        return ans;
    }
}