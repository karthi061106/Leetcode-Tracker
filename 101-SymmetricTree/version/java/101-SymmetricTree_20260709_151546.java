// Last updated: 7/9/2026, 3:15:46 PM
1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        return isMirror(root.left, root.right);
4    }
5    
6    private boolean isMirror(TreeNode n1, TreeNode n2) {
7        if (n1 == null && n2 == null) {
8            return true;
9        }
10        
11        if (n1 == null || n2 == null) {
12            return false;
13        }
14        
15        return n1.val == n2.val && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
16    }
17}