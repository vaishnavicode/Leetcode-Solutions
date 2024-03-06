package Solutions;

import java.util.*;

class TreeNode513 {
    int val;
    TreeNode513 left;
    TreeNode513 right;
    TreeNode513() {}
    TreeNode513(int val) { this.val = val; }
    TreeNode513(int val, TreeNode513 left, TreeNode513 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Q513_BottomLeftTreeValue {
    public static void main(String[] args) {

        // Solution1609 s = new Solution1609();
        // TreeNode513 root = new TreeNode513(1);
        // TreeNode513 rootleft = new TreeNode513(10);
        // root.left = rootleft;
        // TreeNode513 rootright = new TreeNode513(4);
        // root.right = rootright;
        // System.out.println(s.isEvenOddTree(root));

        
    }
    
}

class Solution1609 {
    public boolean isEvenOddTree(TreeNode513 root) {
        Queue<TreeNode513> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        int res = 1;
        int prev = 0;
        while(!que.isEmpty()){
            if(res%2==0)
                prev = Integer.MAX_VALUE;
            else
                prev = Integer.MIN_VALUE;
            while(que.peek()!=null) {
                if(que.peek().val%2!=res%2){
                    return false;
                }
                if(res%2==0 && prev<=que.peek().val){
                    return false;
                }

                if(res%2!=0 && prev>=que.peek().val)
                    return false;
                if (que.peek().left != null)
                    que.add(que.peek().left);
                if (que.peek().right != null)
                    que.add(que.peek().right);
                prev = que.poll().val;
            }
            que.poll();
            if(que.isEmpty()){
                break;
            }
            res++;
            que.add(null);

        }
        return true;
    }
}


