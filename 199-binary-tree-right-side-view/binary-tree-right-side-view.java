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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q =new LinkedList<Integer>();
        right(list,0,root,q);
        return list;

    }
    public static void right(List<Integer> list,int level, TreeNode root,Queue<Integer> q){
        if(root==null) return;
        if(level==q.size()){
            q.add(root.val);
            list.add(root.val);
        }
        right(list,level+1,root.right, q);
        right(list,level+1,root.left, q);
        
    }
}