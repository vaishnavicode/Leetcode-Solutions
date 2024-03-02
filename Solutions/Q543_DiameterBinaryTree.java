package Solutions;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; left = null; right = null;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Q543_DiameterBinaryTree {
    public static void main(String[] args) {

        Solution543 s = new Solution543();
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        TreeNode left = new TreeNode(2);
        TreeNode leftRight = new TreeNode(5);
        TreeNode leftLeft = new TreeNode(4);
        left.right = leftRight;
        left.left = leftLeft;
        root.right = right;
        root.left = left;
        System.out.println(s.diameterOfBinaryTree(root));
                
        
    }
    
}

class Solution543 {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return diameter;
    }

    public int diameter(TreeNode root){
        if(root== null){
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right)+ 1;
    }
}
