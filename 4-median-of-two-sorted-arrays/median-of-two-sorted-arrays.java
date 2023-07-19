class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c=nums1.length+nums2.length;
        int d[]=new int[c];
        for(int i=0;i<nums1.length;i++){
            d[i]=nums1[i];
        }

        for(int i=nums1.length;i<c;i++){
            d[i]=nums2[i-nums1.length];
        }
        Arrays.sort(d);
        int mid=(0+d.length-1)/2;
        if(d.length%2!=0){
         return (double)d[mid];
        }
        else{
           return (double)(d[mid]+d[mid+1])/2;
        }
        
    }
    }