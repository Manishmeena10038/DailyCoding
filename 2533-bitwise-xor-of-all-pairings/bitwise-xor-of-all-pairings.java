class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor = 0;

        // for(int i=0;i<nums1.length;i++){

        //     for(int j=0;j<nums2.length;j++){
        //         int tempxor =0;
        //         tempxor = nums1[i]^nums2[j];
        //         xor = xor^tempxor;
        //     }
           

        // }

        int n1=  nums1.length;
        int n2 =  nums2.length;

        if(n1%2==0&&n2%2==0)return 0;

        if(n2%2==0){
            for(int i=0;i<n2;i++){
                xor =  xor^nums2[i];
            }
            return xor;
        }
        if(n1%2==0){
            for(int i=0;i<n1;i++){
                xor =  xor^nums1[i];
            }
            return xor;
        }

        for(int i=0;i<nums1.length;i++){
            xor  = xor^nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            xor = xor^nums2[i];
        }

        return xor;
    }
}