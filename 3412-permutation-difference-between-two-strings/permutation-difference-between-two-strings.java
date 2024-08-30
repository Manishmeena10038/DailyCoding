class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum =0;

        int arr[] = new int[26];


        for(int i=0;i<s.length();i++){
            int ind = s.charAt(i)-'a';
            arr[ind] = i;
        }

        for(int i=0;i<t.length();i++){
            int j = arr[t.charAt(i)-'a'];
            sum+=Math.abs(i-j);
        }
        return sum;
    } 
}