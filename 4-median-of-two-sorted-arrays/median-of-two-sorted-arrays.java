class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int nm = n+m;
        int nums[] = new int[nm];

        int i=n-1;
        int j = m-1;
        int k =n+m-1;



        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums[k--] = nums1[i--];
            }
            else{
                nums[k--] = nums2[j--];
            }
        }
        while(i>=0){
            nums[k--] = nums1[i--];
        }
        while(j>=0){
            nums[k--] = nums2[j--];
        }

        double result = 0;


        if(nm%2==0){
            result = (nums[nm/2]+nums[(nm/2)-1])/2.0;
        }
        else{
            result = nums[nm/2];
        }
        return result;
    }
}