class Solution {
    public int buyChoco(int[] a, int money) {
        int smal1 = a[0];
        int smal2 = a[1];
        for(int i =1;i<a.length;i++){
            if(smal1>a[i]){
                int temp =smal1;
                smal1=a[i];
                smal2=temp;

            }
            else{
                if(smal2>a[i]){
                    smal2=a[i];
                }
            }
        }
        int ret = money-(smal1+smal2);
        if(ret>=0) return ret;
        return money;
    }
}