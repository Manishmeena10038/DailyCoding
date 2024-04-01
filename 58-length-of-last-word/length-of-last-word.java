class Solution {
    public int lengthOfLastWord(String s) {
        // String[] arr = s.split(" ");
        // 
        // int n =arr.length;
        // if(arr[arr.length-1]==" ") return arr[arr.length-2].length();
        // return arr[n-1]==" "?arr[n-2].length():arr[n-1].length();
        int n = s.length()-1;
        while(n>=0&&s.charAt(n)==' '){
            n--;
        }
        int cnt =0;
        while(n>=0&&s.charAt(n)!=' '){
            cnt++;
            n--;
        }
        return cnt;
    }
}