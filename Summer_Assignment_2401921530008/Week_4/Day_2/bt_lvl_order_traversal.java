class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            int sz = q.size();
            List<Integer> lvl = new ArrayList<>();
            
            for (int i = 0; i < sz; i++) {
                TreeNode node = q.poll();
                lvl.add(node.val);
                
                if (node.left != null)  q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            
            ans.add(lvl);
        }
        
        return ans;
    }
}