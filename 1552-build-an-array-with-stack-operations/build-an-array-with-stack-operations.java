class Solution {
    public List<String> buildArray(int[] target, int n) {
        String ps = "Push";
        String pp = "Pop";
        int num =1;
        int i = 0;
        List<String> buildArra =new ArrayList<>();
        
        while(i<target.length){
            int t = target[i];
            if(t==num){
                buildArra.add(ps);
                i+=1;
            }
            else{
                buildArra.add(ps);
                buildArra.add(pp);
            }
            num+=1;
        }
        return buildArra;
    }
}