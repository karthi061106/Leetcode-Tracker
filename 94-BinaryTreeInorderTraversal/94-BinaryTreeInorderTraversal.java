// Last updated: 7/9/2026, 3:08:27 PM
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }
    public static void helper(TreeNode root, List<Integer> ans){
        if (root == null){
            return;
        }
        helper(root.left, ans);
        ans.add(root.val);
        helper(root.right, ans);
    }
}