// class Solution {
//     public int numSteps(String s) {
//         int carry =0;
//         int cnt = 0;
//         int l = s.length()-1;
//         while(l>0){
//             if(Character.getNumericValue(s.charAt(l))+carry==0){
//                 carry =0;
//                 cnt++;
//             }
//             else if(Character.getNumericValue(s.charAt(l))+carry==2){
//                 carry = 1;
//                 cnt++;
//             }
//             else{
//                 carry = 1;
//                 cnt+=2;
//             }
//             l--;
//         }
//         if(carry==1){
//             cnt++;
//         }
//         return cnt;
//     }
// }

class Solution {
    public int numSteps(String s) {
        int ans =0;
        int carry=0;
        for(int i=s.length()-1;i>0;i--){
            ans++;
            if(s.charAt(i)-'0'+carry==1){
                carry =1;
                ans++;
            }
        }
        return ans+carry;
    }
}