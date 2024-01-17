class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int low =0,high=0;
        ArrayList<Integer>  ar = new ArrayList<>();
        while(low<m&&high<n){
            if(nums1[low]<nums2[high]){
                ar.add(nums1[low]);
                low++;
            }
            else{
                ar.add(nums2[high]);
                high++;
            }
        }
        while(low<m){
            ar.add(nums1[low]);
                low++;
        }
        while(high<n){
             ar.add(nums2[high]);
                high++;
        }
        for(int i=0;i<ar.size();i++){
            nums1[i] = ar.get(i);
        }
    }
}