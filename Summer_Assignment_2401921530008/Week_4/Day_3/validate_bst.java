class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean validate(TreeNode node, long mn, long mx) {
        if (node == null) return true;
        if (node.val <= mn || node.val >= mx) return false;
        
        return validate(node.left,  mn, node.val) &&
               validate(node.right, node.val, mx);
    }
}