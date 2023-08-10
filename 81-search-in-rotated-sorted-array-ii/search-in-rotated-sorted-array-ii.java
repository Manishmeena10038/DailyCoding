// linear search with system.gc optimization (garbage collection)
 class Solution {
    public boolean search(int[] nums, int target) {  
     int high =  nums.length;       
        int i;
        for( i=0;i<high;i++){
            if(nums[i]==target){
                return true;
            }           
        }
        System.gc();
        return false;   
    }
}


// binary search 
// class Solution {   
//     public boolean search(int[] nums, int target) {
//         int low = 0, high = nums.length - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (nums[mid] == target) {
//                 return true;
//             }
//             if (nums[low] < nums[mid]) {
//                 if (target >= nums[low] && target < nums[mid])
//                     high = mid - 1; 
//                 else 
//                     low = mid + 1;
//             } else if (nums[low] > nums[mid]) {
//                 if (target > nums[mid] && target <= nums[high])
//                     low = mid + 1;
//                 else 
//                     high = mid - 1;
//             } else {  low++;}
//         }
//         return false;
//     }
// }



// Linear search for solving just solving this without optimization
// class Solution {
//     public boolean search(int[] nums, int target) {  
//      int high =  nums.length;       
//         int i;
//         for( i=0;i<high;i++){
//             if(nums[i]==target){
//                 return true;
//             }           
//         }
//         return false;   
//     }
// }
