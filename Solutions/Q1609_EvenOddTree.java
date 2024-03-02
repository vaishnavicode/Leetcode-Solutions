package Solutions;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Q1609_EvenOddTree {
    public static void main(String[] args) {

        Solution1609 s = new Solution1609();
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        System.out.println(s.findBottomLeftValue(root));
        
    }
    
}

class Solution1609 {

    int leftmost = 0;
    int leftmostrow = -1;
    void visit(TreeNode root, int depth) {
        if (root == null) return;
        if (depth > leftmostrow) {
            leftmost = root.val;
            leftmostrow = depth;
        }
        visit(root.left, depth+1);
        visit(root.right, depth+1);
    }

    public int findBottomLeftValue(TreeNode root) {
        visit(root, 0)    ;
        return leftmost;
    }
}

