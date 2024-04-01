class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        // 
        int n =arr.length;
        // if(arr[arr.length-1]==" ") return arr[arr.length-2].length();
        return arr[n-1]==" "?arr[n-2].length():arr[n-1].length();
    }
}