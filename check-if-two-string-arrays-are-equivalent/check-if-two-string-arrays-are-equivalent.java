// using String.join method for adding the stirngs of array into one string 


class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1=String.join("",word1);
        String s2=String.join("",word2);
       return s1.equals(s2);
    }
}






// without built in method 
// class Solution {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         String s1 = "";
//         String s2 = "";
       
//         for(int i=0;i<word1.length;i++){
//             s1 = s1 +""+ word1[i];
//         }
//         for(int i=0;i<word2.length;i++){
//             s2 = s2 +""+ word2[i];
//         }
//         return s1.equals(s2);
        
//     }
// }