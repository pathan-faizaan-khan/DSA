import java.security.PublicKey;
import java.util.*;

public class JavaDeque {

    public static class Stack {
        Deque<Integer> deque = new LinkedList<>();
        
        public void push(int ele) {
            deque.addLast(ele);
        }
        public int pop() {
            return deque.removeLast();
        }
        public int peek() {
            return deque.getLast();
        }
    
        
    }
    public static class queue {
        Deque<Integer> deque = new LinkedList<>();
        public void add(int ele) {
            deque.addLast(ele);
        }
        public int remove() {
            return deque.removeFirst();
        }
        public int peek() {
            return deque.getFirst();
        }
        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }
    
   public static void main(String args[]) {
    //  Deque<Integer> deq = new LinkedList<>();
    //  deq.addFirst(1);
    //  deq.addLast(4);
    //  deq.addFirst(2);

    //  System.out.println(deq);
    //  System.out.println(deq.getFirst());
    // Stack s = new Stack();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.pop();
    // System.out.println(s.peek());

    queue q =new queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);

    while (!q.isEmpty()) {
        System.out.println(q.remove());
        
    }
   }
    
}

