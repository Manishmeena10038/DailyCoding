class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int l=0;
        while(i<nums1.length&&l<nums2.length){
            if(nums1[i]==nums2[l]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[l]){
                i++;
            }
            else
            l++;
        }
        return -1;
    }
}