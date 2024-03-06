package Solutions;

import java.util.*;

public class Q872_LeafSimilarTree {
    public static void main(String[] args) {
            
            Solution872 s = new Solution872();
            TreeNode872 root1 = new TreeNode872(1);
            TreeNode872 root2 = new TreeNode872(2);
            System.out.println(s.leafSimilar(root1, root2));
            
        
    }

    
}

class TreeNode872{
    int val;
    TreeNode872 left;
    TreeNode872 right;
    TreeNode872(int x){
        val = x;
    }
}


class Solution872 {
    public boolean leafSimilar(TreeNode872 root1, TreeNode872 root2) {
        List<Integer> nodeList1 = new ArrayList<>();
        List<Integer> nodeList2 = new ArrayList<>();
        findLeafDfs(root1, nodeList1);
        findLeafDfs(root2, nodeList2);
        return nodeList1.equals(nodeList2);
    }

    private void findLeafDfs(TreeNode872 node, List<Integer> nodeList) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            nodeList.add(node.val);
        } else {
            findLeafDfs(node.left, nodeList);
            findLeafDfs(node.right, nodeList);
        }
    }
}