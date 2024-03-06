package Solutions;

public class Q2385_InfectedTree {
    public static void main(String[] args) {
        
        //Solutions2385 s = new Solutions2385();

    }
    
}

class TreeNode2385{
    int val;
    TreeNode2385 left;
    TreeNode2385 right;
    TreeNode2385(int x){
        val = x;
    }
}

class Solutions2385{
    private int result;

    public int amountOfTime(TreeNode2385 root, int start) {
        DFS(root, start);
        return result;
    }

    private int DFS(TreeNode2385 node, int start){
        if(node == null) return 0;

        int leftDepth = DFS(node.left, start);
        int rightDepth = DFS(node.right, start);

        if(node.val == start){
            result = Math.max(leftDepth, rightDepth);
            return -1;
        }
        else if(leftDepth >= 0 && rightDepth >= 0)
            return Math.max(leftDepth, rightDepth)+1;
        
        result = Math.max(result, Math.abs(leftDepth - rightDepth));
        return Math.min(leftDepth, rightDepth) - 1;
    }
}
