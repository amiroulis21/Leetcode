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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        if(root == null) {
            return t;
        }
        else if(root.left == null && root.right == null) {
            t.add(root.val);
            return t;
        }
        else if(root.left == null) {
            t.add(root.val);
            t.addAll(inorderTraversal(root.right));
           
        }
        else{
        t.addAll(inorderTraversal(root.left));
        t.add(root.val);
        t.addAll(inorderTraversal(root.right));
        
        }
        return t;
    }
}