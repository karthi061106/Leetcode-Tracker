// Last updated: 7/9/2026, 3:11:55 PM
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        if (p == null && q == null) {
4            return true;
5        }
6        
7        if (p != null && q != null && p.val == q.val) {
8            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
9        }
10        
11        return false;        
12    }
13}