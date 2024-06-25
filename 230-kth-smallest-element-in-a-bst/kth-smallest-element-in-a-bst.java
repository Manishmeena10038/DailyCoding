/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        help(root,arr,k);
        return arr.get(k-1);
    }
    public static void help(TreeNode root, ArrayList<Integer> arr,int k){
        if(root==null)return;
        if(arr.size()==k)return;
        help(root.left,arr,k);
        arr.add(root.val);
        help(root.right,arr,k);
    }
}