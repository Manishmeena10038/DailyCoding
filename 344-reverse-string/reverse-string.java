class Solution {
    public void reverseString(char[] s) {
        int low =0;
        int high = s.length-1;
        while(low<=high){
            char d = s[high];
            s[high]= s[low];
            s[low] = d;
            low++;
            high--;
        }
    }
}