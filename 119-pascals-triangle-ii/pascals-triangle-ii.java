class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> r = new ArrayList<>();
        long ans = 1;
        r.add(1);
        for(int i=1;i<=rowIndex;i++){
            ans = ans* (rowIndex+1-i);
            ans = ans/i;
            r.add((int)ans);
        }
        return r;
    }
}