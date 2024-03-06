package Solutions;

class TreeNode543 {
    int val;
    TreeNode543 left;
    TreeNode543 right;
    TreeNode543() {}
    TreeNode543(int val) { this.val = val; left = null; right = null;}
    TreeNode543(int val, TreeNode543 left, TreeNode543 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Q543_DiameterBinaryTree {
    public static void main(String[] args) {

        Solution543 s = new Solution543();
        TreeNode543 root = new TreeNode543(1);
        TreeNode543 right = new TreeNode543(3);
        TreeNode543 left = new TreeNode543(2);
        TreeNode543 leftRight = new TreeNode543(5);
        TreeNode543 leftLeft = new TreeNode543(4);
        left.right = leftRight;
        left.left = leftLeft;
        root.right = right;
        root.left = left;
        System.out.println(s.diameterOfBinaryTree(root));
                
        
    }
    
}

class Solution543 {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode543 root) {
        diameter(root);
        return diameter;
    }

    public int diameter(TreeNode543 root){
        if(root== null){
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right)+ 1;
    }
}
