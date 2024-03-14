class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int a1=m-1;
        // int a2=0;
        // if(m)
        // int i=0;
        // if(n!=0){

        
        // while(a1<m){
        //     if(nums1[a1]<=nums2[a2]){
               
        //         a1++;
        //     }
        //     else{
        //         int temp = nums1[a1++];
        //         nums1[i]=nums2[a2];
        //         nums2[a2]=temp;
                
        //     }
        //     i++;
        // }
        // while(a2<n){
        //     nums1[i++]=nums2[a2++];
        // }
        // }




        //  if(m!=0&&n!=0)
        // while(a1>=0&&a2>=0){
        //     if(nums1[a1]>=nums2[a2]){

            
        //     int temp = nums1[a1];
        //     nums1[a1] = nums2[a2];
        //     nums2[a2] = temp;
        //     a1--;
        //     a2--;
        //     }
        //     else
        //     a2--;
        // }
        // // Arrays.sort(nums1);
        // // Arrays.sort(nums2);
        // a2=0;
        // while(a2<n){
        //     nums1[a2+m]=nums2[a2];
        //     a2++;
        // }
        // Arrays.sort(nums1);




     int i = m-1;
     int j=n-1;
     int k = n+m-1;
     while(j>=0){
        if(i>=0&&nums1[i]>nums2[j]){
            nums1[k--]=nums1[i--];
        }
        else{
            nums1[k--]=nums2[j];
            j--;
        }
     }
    }
}

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//     int i=m-1,j=n-1,k=m+n-1;
//      while(j>=0){
//         if(i>=0&&nums1[i]>nums2[j]){
//             nums1[k--]=nums1[i];
//             i--;
//         }
//         else{
//            nums1[k--]=nums2[j];
//             j--;
//         }
//      }
// }
// }