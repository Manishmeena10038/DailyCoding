class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] ar = new int[1001];
        int n = nums1.length,m=nums2.length;
        int in = Math.max(n,m);
        int[]  ans =  new int[in];
        for(int i:nums1){
            if(ar[i]<1)
            ar[i]++;
        }
        in=0;
        for(int i:nums2){
            if(ar[i]>0){
                ar[i]--;
                ans[in++]=i;
            }
        }
        return Arrays.copyOf(ans,in);
    }
}