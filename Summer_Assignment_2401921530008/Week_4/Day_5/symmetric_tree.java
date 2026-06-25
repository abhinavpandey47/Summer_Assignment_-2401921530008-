class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }
    
    private boolean mirror(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null) return false;
        if (l.val != r.val)         return false;
        
        return mirror(l.left,  r.right) &&
               mirror(l.right, r.left);
    }
}
