package Q_232_Queue_Using_Stacks;

import java.util.Stack;

public class Q232_QueueUsingStacks {
    public static void main(String[] args) {

        Solution232 obj = new Solution232();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.empty());
        
    }
    
}



class Solution232 {
    private Stack<Integer> st1;
    private Stack<Integer> st2;

    public Solution232() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        st1.push(x);
    }

    public int pop() {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        return st2.pop();
    }

    public int peek() {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        return st2.peek();
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
