/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p||root==q){
            return root;
        }
        if(root==null){
            return null;
        }
        TreeNode Left = lowestCommonAncestor(root.left,p,q);
        TreeNode Right = lowestCommonAncestor(root.right,p,q);

        if(Left==null){
            return Right;
        }
        else if(Right==null){
            return Left;
        }
        else if(Left==null||Right==null){
            return null;
        }
        
        return root;

    }
}