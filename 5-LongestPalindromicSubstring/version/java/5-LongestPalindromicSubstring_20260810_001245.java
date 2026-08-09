// Last updated: 8/10/2026, 12:12:45 AM
1class Solution {
2    public List<TreeNode> generateTrees(int n) {
3        if (n == 0) return new ArrayList<>();
4
5        List<TreeNode>[] dp = new ArrayList[n + 1];
6        dp[0] = new ArrayList<>();
7        dp[0].add(null);
8        for (int nodes = 1; nodes <= n; nodes++) {
9            dp[nodes] = new ArrayList<>();
10            for (int root = 1; root <= nodes; root++) {
11                for (TreeNode left_tree : dp[root - 1]) {
12                    for (TreeNode right_tree : dp[nodes - root]) {
13                        TreeNode root_node = new TreeNode(root);
14                        root_node.left = left_tree;
15                        root_node.right = clone(right_tree, root);
16                        dp[nodes].add(root_node);
17                    }
18                }
19            }
20        }
21        return dp[n];
22    }
23
24    private TreeNode clone(TreeNode n, int offset) {
25        if (n == null) return null;
26        TreeNode node = new TreeNode(n.val + offset);
27        node.left = clone(n.left, offset);
28        node.right = clone(n.right, offset);
29        return node;
30    }
31}