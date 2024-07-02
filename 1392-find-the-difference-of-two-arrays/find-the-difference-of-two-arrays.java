class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> fin=new ArrayList<>();
         List<Integer> arr= new ArrayList<>();
         List<Integer> arr1= new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            boolean flag = false;
     
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                if(!arr.contains(nums1[i]))
                arr.add(nums1[i]);
            }
        }
        fin.add(arr);
        
        for(int i=0;i<nums2.length;i++){
            boolean flag = false;
     
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                if(!arr1.contains(nums2[i]))
                arr1.add(nums2[i]);
            }
        }
        fin.add(arr1);

        return fin;



    }
}