class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;
        
        while (!q.isEmpty()) {
            int sz = q.size();
            LinkedList<Integer> lvl = new LinkedList<>();
            
            for (int i = 0; i < sz; i++) {
                TreeNode node = q.poll();
                
                if (leftToRight) lvl.addLast(node.val);
                else             lvl.addFirst(node.val);
                
                if (node.left != null)  q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            
            ans.add(lvl);
            leftToRight = !leftToRight;
        }
        
        return ans;
    }
}