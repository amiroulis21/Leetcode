# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def height(self, root):
        if root is None:
            return 0

        left = self.height(root.left)
        if left == -1:
            return -1

        right = self.height(root.right)
        if right == -1:
            return -1

        if abs(left - right) > 1:
            return -1

        return max(left, right) + 1
    def isBalanced(self, root):
        return self.height(root) != -1
        """
        :type root: TreeNode
        :rtype: bool
        """