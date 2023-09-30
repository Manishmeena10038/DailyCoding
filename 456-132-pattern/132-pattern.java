// class Solution {
//     public boolean find132pattern(int[] nums) {
//         boolean bool = false;
//         int i = nums.length-1;
//         int j = nums.length -2;
//         int k = j-1;

//         while(j>0){
//             if(nums[i]<nums[j]){
               

//                 if(nums[k]<nums[i]){
//                     bool = true;
//                 }
//                 else{
//                     k--;
//                 }

//             }
//             else{
//                 i--;
               
//             }
//             while(i<j){
//                 j--;
//             }  
//             while(k>j){
//                 k--;
//             }
//         j--;
//     }
//         return bool;
//     }
// }

class Solution {
  public boolean find132pattern(int[] nums) {
    Deque<Integer> stack = new ArrayDeque<>(); // decreasing stack
    int ak = Integer.MIN_VALUE;                // We want to find a seq ai < ak < aj.

    for (int i = nums.length - 1; i >= 0; --i) {
      // ai < ak, we're done because ai must also smaller than aj
      if (nums[i] < ak)
        return true;
      while (!stack.isEmpty() && stack.peek() < nums[i])
        ak = stack.pop();
      stack.push(nums[i]); // nums[i] is a candidate of aj.
    }

    return false;
  }
}
