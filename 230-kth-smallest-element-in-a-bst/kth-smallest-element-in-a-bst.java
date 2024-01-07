/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * 
 */
// class Solution {
    

//     public int kthSmallest(TreeNode root, int k) {
//         // int counter = helper(root.left);
//         // if(k<=counter)
//         // {
//         // return kthSmallest(root.left, k);
//         // }
//         // else if(k > counter+1)
//         // {
//         // return kthSmallest(root.right, k-1-counter);
//         // }
//         // return root.val;

//         // }

//         // public int helper(TreeNode root)
//         // {
//         // if(root == null) return 0;

//         // return 1+helper(root.left)+helper(root.right);
//         int ans = 0;
//         int cnt = 0;
//         ret(root, ans, k, cnt);
//         return ans;

//     }

//     public void ret(TreeNode root, int ans, int k, int cnt) {
//         if (root == null)
//             return;
//         ret(root.left, ans, k, cnt);
//         cnt++;
//         if (k == cnt) {
//             ans = root.val;
//             return;
//         }
//         ret(root.right, ans, k, cnt);
//     }
// }
class Solution {

    public int kthSmallest(TreeNode root, int k) {
        int[] result = new int[1];
        int[] count = new int[1];
        count[0] = 0;
        ret(root, result, k, count);
        return result[0];
    }

    public void ret(TreeNode root, int[] result, int k, int[] count) {
        if (root == null || count[0] >= k) {
            return;
        }

        ret(root.left, result, k, count);

        count[0]++;
        if (count[0] == k) {
            result[0] = root.val;
            return;
        }

        ret(root.right, result, k, count);
    }
}
