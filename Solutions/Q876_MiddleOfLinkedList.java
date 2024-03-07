package Solutions;

public class Q876_MiddleOfLinkedList {
    public static void main(String[] args) {


        
    }
}


class Solution876 {
    public ListNode middleNode(ListNode head) {

        int count = countNode(head);
        int mid = count/2;
        
        for(int i = 0; i < mid; i++){
            head = head.next;
        }
        return head;
        
    }

    public int countNode(ListNode head){

        int count = 0;

        while(head != null){
            count++;
            head = head.next;
        }

        return count;

    }
}