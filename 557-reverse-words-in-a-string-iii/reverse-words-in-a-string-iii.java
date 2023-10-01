class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i =0; i<arr.length;i++){
            StringBuilder rev = new StringBuilder(arr[i]);
            rev.reverse();
	        sb.append(rev);
            if(i != arr.length-1){
                sb.append(" ");
            }
        }
         System.gc();
        return sb.toString();
    }
}






// less complexity 
// class Solution {
//     public String reverseWords(String s) {
//         int n = s.length();
//         String[] str = null;
//         str = s.split(" ");
//         String reverseword = "";
//         for(String d : str){
//             StringBuilder sb = new StringBuilder(d);
//             sb.reverse();
//             reverseword= reverseword + sb.toString() +" ";
//         }
//         return reverseword.substring(0,reverseword.length()-1);
//     }
// }