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
    public int findSecondMinimumValue(TreeNode root) {
        // HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> arr = new ArrayList<>();
        help(root,arr);
        if(arr.size()<2) return -1;
        Collections.sort(arr);
        return arr.get(1);
    }
    public static void help(TreeNode root, ArrayList<Integer> arr){
        if(root==null) return;
        help(root.left,arr);
        if(!arr.contains(root.val)) arr.add(root.val);
        help(root.right,arr);
    }
}