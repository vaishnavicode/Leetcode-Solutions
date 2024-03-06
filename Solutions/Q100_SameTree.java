package Solutions;

class TreeNode100 {
    int val;
    TreeNode100 left;
    TreeNode100 right;
    TreeNode100() {}
    TreeNode100(int val) { this.val = val; }
    TreeNode100(int val, TreeNode100 left, TreeNode100 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Q100_SameTree {
    public static void main(String[] args) {

        Solution100 s = new Solution100();
        TreeNode100 p1 = new TreeNode100(2);
        TreeNode100 p2 = new TreeNode100(3);
        TreeNode100 p = new TreeNode100(1);
        p.left = p1;
        p.right = p2;
        TreeNode100 q1 = new TreeNode100(2);
        TreeNode100 q2 = new TreeNode100(3);
        TreeNode100 q = new TreeNode100(1);
        q.left = q1;
        q.right = q2;
        System.out.println(s.isSameTree(p, q));
        
    }
    
}

class Solution100 {
    public boolean isSameTree(TreeNode100 p, TreeNode100 q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}


