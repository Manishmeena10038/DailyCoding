// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {
//         int[] ar = new int[52];
//         int cnt = 0;
//         for (char c : jewels.toCharArray()) {
//             if (Character.isLowerCase(c)) {
//                 ar[c - 'a'] = 1;
//             } else if (Character.isUpperCase(c)) {
//                 ar[c - 'A' + 26] = 1;
//             }
//         }
//         for (char c : stones.toCharArray()) {
//             if (Character.isLowerCase(c) && ar[c - 'a'] == 1) {
//                 cnt++;
//             } else if (Character.isUpperCase(c) && ar[c - 'A' + 26] == 1) {
//                 cnt++;
//             }
//         }
//         return cnt;
//     }
// }

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result=0;
        for (int i=0; i<jewels.length();i++){
            for (int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    result++;
                }
        }
        }
        return result;
    }
}
