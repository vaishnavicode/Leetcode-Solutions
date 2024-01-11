package Solutions;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class MaxDifferenceBetweenNodeAndAncestor {
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
    
            Solution1026 s = new Solution1026();
            System.out.println(s.maxAncestorDiff(root));
        
    }
    
}

class Solution1026 {
    public int maxAncestorDiff(TreeNode root) {
        int[] m = {0};
        dfs(root, m);
        return m[0];
    }

    private int[] dfs(TreeNode root, int[] m) {
        if (root == null) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        }

        int[] left = dfs(root.left, m);
        int[] right = dfs(root.right, m);

        int minVal = Math.min(root.val, Math.min(left[0], right[0]));
        int maxVal = Math.max(root.val, Math.max(left[1], right[1]));

        m[0] = Math.max(m[0], Math.max(Math.abs(minVal - root.val), Math.abs(maxVal - root.val)));

        return new int[]{minVal, maxVal};
    }
}
