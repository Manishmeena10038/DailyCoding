// class Solution {
//     public int countPrefixSuffixPairs(String[] words) {
//         int cnt =0;

//         for(int i=0;i<words.length;i++){
//             for(int j=i+1;j<words.length;j++){
//                 String stri = words[i];
//                 int n = stri.length();

//                 String strj = words[j];
//                 int m = strj.length();

//                 if(m>=n){
//                     String f = strj.substring(0,n);
//                     String l = strj.substring(m-n,m);
//                     if(f.equals(stri)&&l.equals(stri))cnt++;
//                 }
                
//             }
//         } 
//         return cnt;
//     }
// }




class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt =0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[j].startsWith(words[i])&&words[j].endsWith(words[i])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}


