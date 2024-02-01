package Q_872_Leaf_Similar_Trees;

import java.util.*;

public class LeafSimilarTree {
    public static void main(String[] args) {
            
            Solution872 s = new Solution872();
            TreeNode root1 = new TreeNode(1);
            TreeNode root2 = new TreeNode(2);
            System.out.println(s.leafSimilar(root1, root2));
            
        
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


class Solution872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> nodeList1 = new ArrayList<>();
        List<Integer> nodeList2 = new ArrayList<>();
        findLeafDfs(root1, nodeList1);
        findLeafDfs(root2, nodeList2);
        return nodeList1.equals(nodeList2);
    }

    private void findLeafDfs(TreeNode node, List<Integer> nodeList) {
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