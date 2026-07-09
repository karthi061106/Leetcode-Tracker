// Last updated: 7/9/2026, 3:08:22 PM

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int r=maxDepth(root.right);
        int l=maxDepth(root.left);
        return 1+Math.max(l,r);


        
    }
}