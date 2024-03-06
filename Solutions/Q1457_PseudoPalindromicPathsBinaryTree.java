package Solutions;

public class Q1457_PseudoPalindromicPathsBinaryTree {
    public static void main(String[] args) {

        //Solution1457 s = new Solution1457();
        
    }
    
}

/**
 * Definition for a binary tree node.
 * public class TreeNode1457 {
 *     int val;
 *     TreeNode1457 left;
 *     TreeNode1457 right;
 *     TreeNode1457() {}
 *     TreeNode1457(int val) { this.val = val; }
 *     TreeNode1457(int val, TreeNode1457 left, TreeNode1457 right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class TreeNode1457{
    int val;
    TreeNode1457 left;
    TreeNode1457 right;
    TreeNode1457(int x){
        val = x;
    }
}

class Solution1457 {
    int ans =0;
    public int pseudoPalindromicPaths (TreeNode1457 root) {
        func(root, 0);
        return ans;
    }
    void func(TreeNode1457 node, int seen){
        if(node == null) return;
        // System.out.println("b4 " + Integer.toBinaryString(seen));
        seen^=(1<<node.val);
        // System.out.println("after " + Integer.toBinaryString(seen));
        if(node.left == null && node.right == null){
            if((seen & (seen-1)) == 0){
                ans++;
            }
            return;
        }
        func(node.left, seen);
        func(node.right, seen);

    }
}
