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
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        // if(root.left==null&&root.right==null)
        // return 0;
        int add =0;
       
            if(root.left!=null){
                if(root.left.left==null&&root.left.right==null){
                    add+=root.left.val;
                }
                else
                add+=sumOfLeftLeaves(root.left);
                
            }
            add+=sumOfLeftLeaves(root.right);
            return add;
            


        
       
    }
    // public  void s2(TreeNode root){
    //     //  if(root==null)
    //     //     return; 
    //     if(root.left==null&&root.right==null){
    //         add+=root.val;
    //         return;
    //     }
    //     s2(root.left);
    //     s2(root.right);
    //     // root = root.right;
    //     // s2(root.right);
    //     //  if(root.left==null){
    //     //     add-=root.val;
    //     // }
    // }

}