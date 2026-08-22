# Last updated: 8/22/2026, 4:07:01 PM
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def countDominantNodes(self, root: TreeNode | None) -> int:
        self.dc=0;
        def dfs(node:TreeNode|None)->float:
            if not node:
                return float('-inf')
            lm=dfs(node.left)
            rm=dfs(node.right)
            cm=max(node.val,lm,rm)
            if node.val==cm:
                self.dc+=1
            return cm
        dfs(root)
        return self.dc
        
        