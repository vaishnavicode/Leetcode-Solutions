package Solutions;

class ListNode141 {
    int val;
    ListNode141 next;
    ListNode141(int x) {
    val = x;
    next = null;
    }
}


public class Q141_LinkedListCycle {
    public static void main(String[] args) {

        //[3,2,0,-4]

        Solution141 s = new Solution141();
        ListNode141 root = new ListNode141(3);
        root.next = new ListNode141(2);
        root.next.next = new ListNode141(0);
        root.next.next.next = new ListNode141(-4);
        root.next.next.next.next = root.next;
        System.out.println(s.hasCycle(root));
        
        
    }
    
}

class Solution141 {
    public boolean hasCycle(ListNode141 head) {
        
        ListNode141 fast = head; // Initialize fast pointer to head
        ListNode141 slow = head; // Initialize slow pointer to head

        while (fast != null && fast.next != null) { // Traverse the list until fast pointer reaches end or NULL
            fast = fast.next.next; // Move fast pointer two steps ahead
            slow = slow.next; // Move slow pointer one step ahead
            if (fast == slow) { // If fast meets slow, there is a cycle
                return true;
            }
        }
        return false; // If fast reaches NULL, there is no cycle
    }
}