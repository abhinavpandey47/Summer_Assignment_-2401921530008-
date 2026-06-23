class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solve(root, ans);
        return ans;
    }
    
    private void solve(TreeNode node, List<Integer> ans) {
        if (node == null) return;
        
        solve(node.left, ans);
        ans.add(node.val);
        solve(node.right, ans);
    }
}
