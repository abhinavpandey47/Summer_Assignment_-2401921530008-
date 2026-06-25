class Solution {
    int mx = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        gain(root);
        return mx;
    }
    
    private int gain(TreeNode node) {
        if (node == null) return 0;
        
        int l = Math.max(gain(node.left),  0);
        int r = Math.max(gain(node.right), 0);
        
        mx = Math.max(mx, node.val + l + r);
        
        return node.val + Math.max(l, r);
    }
}