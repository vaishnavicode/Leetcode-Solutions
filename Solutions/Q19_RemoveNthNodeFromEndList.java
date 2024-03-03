package Solutions;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Q19_RemoveNthNodeFromEndList {
    public static void main(String[] args) {

        Solution19 s = new Solution19();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        

        ListNode ans = s.removeNthFromEnd(root, 2);
        while(ans!= null){
            System.out.println(ans.val);
            ans = ans.next;
        } 


    }

        
}
    

class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode left = head;
        ListNode right = head.next;

        int i = 1;

        while(right != null){
            right = right.next;
            if (i > n){
                left = left.next;
            }
            i++;
        }

        if(i==n){
            return head.next;
        }

        left.next = left.next.next;
      
        
        return head;
    }
}
