class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int nm = Math.min(n,m);

        int[] ans = new int[nm];
        int[] use = new int[1001];
        for(int i:nums1){
            use[i]++;

        }
        int in = 0;
        for(int i:nums2){
            if(use[i]>0){
                use[i]--;
            ans[in++]=i;
            }
        }
        return Arrays.copyOf(ans,in);
    }
}