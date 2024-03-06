package Solutions;

class TreeNode1609 {
    int val;
    TreeNode1609 left;
    TreeNode1609 right;
    TreeNode1609() {}
    TreeNode1609(int val) { this.val = val; }
    TreeNode1609(int val, TreeNode1609 left, TreeNode1609 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Q1609_EvenOddTree {
    public static void main(String[] args) {

        Solution1609 s = new Solution1609();
        TreeNode1609 root = new TreeNode1609(2);
        TreeNode1609 left = new TreeNode1609(1);
        TreeNode1609 right = new TreeNode1609(3);
        root.left = left;
        root.right = right;
        System.out.println(s.findBottomLeftValue(root));
        
    }
    
}

class Solution1609 {

    int leftmost = 0;
    int leftmostrow = -1;
    void visit(TreeNode1609 root, int depth) {
        if (root == null) return;
        if (depth > leftmostrow) {
            leftmost = root.val;
            leftmostrow = depth;
        }
        visit(root.left, depth+1);
        visit(root.right, depth+1);
    }

    public int findBottomLeftValue(TreeNode1609 root) {
        visit(root, 0)    ;
        return leftmost;
    }
}

