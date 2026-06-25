class Solution {
    Map<Integer, Integer> mp = new HashMap<>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            mp.put(inorder[i], i);
        }
        return build(preorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }
    
    private TreeNode build(int[] pre, int ps, int pe, int is, int ie) {
        if (ps > pe || is > ie) return null;
        
        TreeNode root = new TreeNode(pre[ps]);
        int mid = mp.get(pre[ps]);
        int leftSize = mid - is;
        
        root.left  = build(pre, ps + 1, ps + leftSize, is, mid - 1);
        root.right = build(pre, ps + leftSize + 1, pe, mid + 1, ie);
        
        return root;
    }
}