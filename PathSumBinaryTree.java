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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        return calcSum(root, targetSum, 0);  
    }

    public boolean calcSum(TreeNode root, int targetSum, int total) {
        if(root == null) {
            return false;
        }
        total += root.val;
        if(root.left == null && root.right == null && total == targetSum) {
            return true;
        }
       return calcSum(root.left, targetSum, total) || calcSum(root.right, targetSum, total);

      
        
    }
}