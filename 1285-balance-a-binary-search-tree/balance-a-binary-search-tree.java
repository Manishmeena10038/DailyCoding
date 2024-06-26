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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        list(root,arr);
        return build(arr,0,arr.size()-1);


    }
    public static void list(TreeNode root, ArrayList<Integer> arr){
        if(root==null) return;
        list(root.left,arr);
        arr.add(root.val);
        list(root.right,arr);

    }
    public TreeNode build(ArrayList<Integer> arr, int start, int end){
        if(start>end)return null;
        int mid = start+(end-start)/2;
        TreeNode node = new TreeNode(arr.get(mid));
        node.left=build(arr,start,mid-1);
        node.right = build(arr,mid+1,end);
        return node;
    }
}