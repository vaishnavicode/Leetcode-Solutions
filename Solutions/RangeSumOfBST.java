package Solutions;

public class RangeSumOfBST {

    public static void main(String[] args) {
            
            Solution938 s = new Solution938();
            TreeNode root = new TreeNode(10);
            root.left = new TreeNode(5);
            root.right = new TreeNode(15);
            root.right.left = new TreeNode(13);
            root.right.right = new TreeNode(18);
            root.left.left = new TreeNode(3);
            root.left.right = new TreeNode(7);
            System.out.println(s.rangeSumBST(root, 6, 10));
    }
    
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

class Solution938{
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if (root == null) {
            return 0;
        }

        // If the current node's value is within the range, add it to the sum
        int sum = 0;
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        // Recursively explore the left and right subtrees if they can possibly contain values in the range
        if (root.val > low) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (root.val < high) {
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;
    }
}
