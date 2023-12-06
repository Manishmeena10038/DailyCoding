class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int rnds = 28;
        
        if (n >= 7) {
            int rnd = n / 7;
            int rem = n % 7;

            for (int i = 0; i < rnd; i++) {
                sum += rnds + 7 * i;
            }

            for (int k = 1; k <= rem; k++) {
                sum += rnd + k;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }

        return sum;
    }
}


// int a = 1;
//         int total = 0;
//         int temp = 0;
//         int count =1;
//         for(int i = a;n>0;i++){
//             temp +=i;
//             n--;
//             if(count%7==0){
//                 a++;
//                 i=a-1;
//             }
//             count++;
//         }
//         return temp;