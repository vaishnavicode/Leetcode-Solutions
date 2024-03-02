package Q_938_Range_Sum_Of_BST;

public class RangeSumOfBST {

    public static void main(String[] args) {
            
            //Solution938 s = new Solution938();
            
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
