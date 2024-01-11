package Solutions;

public class InfectedTree {
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node3.right = node4;

        Solutions2385 s = new Solutions2385();
        System.out.println(s.amountOfTime(root, 4));

    }
    
}

class Solutions2385{
    private int result;

    public int amountOfTime(TreeNode root, int start) {
        DFS(root, start);
        return result;
    }

    private int DFS(TreeNode node, int start){
        if(node == null) return 0;

        int leftDepth = DFS(node.left, start);
        int rightDepth = DFS(node.right, start);

        if(node.val == start){
            result = Math.max(leftDepth, rightDepth);
            return -1;
        }
        else if(leftDepth >= 0 && rightDepth >= 0)
            return Math.max(leftDepth, rightDepth)+1;
        
        result = Math.max(result, Math.abs(leftDepth - rightDepth));
        return Math.min(leftDepth, rightDepth) - 1;
    }
}
