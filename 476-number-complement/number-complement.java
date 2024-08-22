class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();

        while(num>0){
           int  rem = num%2;
            num=num/2;
            arr.add(rem);
        }
        Collections.reverse(arr);
        // int len = bf.length();
        int len = arr.size();
        int rembit = len%4;

        // while(rembit>0&&len>4){
        //     arr.add(0);
        //     rembit--;
        // }
        Collections.reverse(arr);
        String bf = sb.toString();

        int ans = 0;

        for(int i=0;i<arr.size();i++){
            int j = arr.get(i);
            // int j = c-'0';
            if(j==0)j=1;
            else j=0;
            ans+=j*Math.pow(2,i);
        }
        return ans;

    }
}