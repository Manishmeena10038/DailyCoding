class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int tot = m+n;
        int[] nums = merge(nums1,n,nums2,m);
        double result =0;
        
        if(tot%2==1) {int mid = tot/2;
        result = nums[mid];
        }

        if(tot%2==0) {int mid1=tot/2,mid2=(tot/2)-1;
        result = (double)(nums[mid1]+nums[mid2])/2;
        }
        return result;


    }
    static int[] merge(int[] nums1, int n, int[] nums2, int m){

        int low=0;
        int high=0;
        int[] nums = new int[m+n];
        int j=0;
        while(low<n && high<m){
            if(nums1[low]<=nums2[high]){
                nums[j++]=nums1[low];
                low++;
            }
            else{
                nums[j++] = nums2[high];
                high++;
            }
        }
        while(low<n){
            nums[j++]=nums1[low];
                low++;
        }
        while(high<m){
            nums[j++] = nums2[high];
                high++;
        }
        return nums;

    }
}