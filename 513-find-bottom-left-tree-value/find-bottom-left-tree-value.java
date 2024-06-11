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
public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightSideView(root,list);
        return list.get(list.size()-1);

        // int last = 0;
        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);

        // while (!q.isEmpty()) {
        //     int count = q.size();
        //     for (int i = 0; i < count; i++) {
        //         TreeNode curr = q.poll();
        //         if (i == 0)
        //             last = curr.val;  // last leftMost val
        //         if (curr.left != null)
        //             q.add(curr.left);
        //         if (curr.right != null)
        //             q.add(curr.right);
        //     }
        // }
        // return last;

    }
    public List<Integer> rightSideView(TreeNode root,List<Integer> list ) {
        
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
        
        right(list,level+1,root.left, q);
        right(list,level+1,root.right, q);
        
    }
}