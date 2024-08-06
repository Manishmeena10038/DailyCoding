class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];

        for(char c: word.toCharArray()){
            arr[c-'a']++;
        }

        Arrays.sort(arr);

        int diguse = 0;
        int ans = 0;
        int cnt = 1;

        int i  =25;
        while(i>=0&&arr[i]!=0){
            diguse++;
            ans+=(arr[i]*cnt);

            if(diguse==8){
                diguse=0;
                cnt++;
            }
            i--;
           
        }
        return ans;
    }
}