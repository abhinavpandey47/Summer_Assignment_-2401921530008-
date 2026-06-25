public class Codec {
    
    public String serialize(TreeNode root) {
        if (root == null) return "N";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
        return build(q);
    }
    
    private TreeNode build(Queue<String> q) {
        String val = q.poll();
        if (val.equals("N")) return null;
        
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left  = build(q);
        node.right = build(q);
        
        return node;
    }
}