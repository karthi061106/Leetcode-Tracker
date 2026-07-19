# Last updated: 7/19/2026, 9:16:58 AM
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8    def countDominantNodes(self, root: TreeNode | None) -> int:
9        self.dc=0;
10        def dfs(node:TreeNode|None)->float:
11            if not node:
12                return float('-inf')
13            lm=dfs(node.left)
14            rm=dfs(node.right)
15            cm=max(node.val,lm,rm)
16            if node.val==cm:
17                self.dc+=1
18            return cm
19        dfs(root)
20        return self.dc
21        
22        