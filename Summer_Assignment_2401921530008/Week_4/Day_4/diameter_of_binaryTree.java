class Solution {
    int mx = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return mx;
    }
    
    private int depth(TreeNode node) {
        if (node == null) return 0;
        
        int l = depth(node.left);
        int r = depth(node.right);
        
        mx = Math.max(mx, l + r);
        
        return 1 + Math.max(l, r);
    }
}