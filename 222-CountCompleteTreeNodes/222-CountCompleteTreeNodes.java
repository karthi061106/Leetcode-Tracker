// Last updated: 7/9/2026, 3:07:22 PM
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int a = countNodes(root.left);
        int b = countNodes(root.right);

        return a + b + 1;
    }
}