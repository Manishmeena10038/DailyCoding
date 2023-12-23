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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inmap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inmap.put(inorder[i],i);
        }
        TreeNode root = buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inmap);
        return root;
    }
    static TreeNode buildTree(int[] preorder,int prestart,int preend,int[] inorder,int instart, int inend,Map<Integer,Integer> inmap){
        if(prestart>preend||instart>inend) return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int inroot = inmap.get(root.val);
        int inleft = inroot-instart;

        root.left = buildTree(preorder,prestart+1,prestart+inleft,inorder,instart,inroot-1,inmap);
        
        root.right = buildTree(preorder,prestart+inleft+1,preend,inorder,inroot+1,inend,inmap);
    return root;}
}