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

public class Q100_SameTree {
    public static void main(String[] args) {

        Solution100 s = new Solution100();
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(3);
        TreeNode p = new TreeNode(1);
        p.left = p1;
        p.right = p2;
        TreeNode q1 = new TreeNode(2);
        TreeNode q2 = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = q1;
        q.right = q2;
        System.out.println(s.isSameTree(p, q));
        
    }
    
}

class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}


