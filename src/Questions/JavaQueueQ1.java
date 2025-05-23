package Questions;
import java.util.*;
// Implementing a stack using 2 Queue
public class JavaQueueQ1 {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int ele) {
           
            if(!q1.isEmpty()) {
                q1.add(ele);
            } else {
                q2.add(ele);
            }
        }

        public int pop() {
            if(isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            if(!q1.isEmpty()) {
               
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if(q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }

                return top;
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }

                return top;
            }
        }

        public int peek() {
             if(isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            if(!q1.isEmpty()) {
               
                while (!q1.isEmpty()) {
                    top = q1.remove();
                   
                    q2.add(top);
                }

                return top;
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    
                    q1.add(top);
                }

                return top;
            }
        
        }


    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while (!s.isEmpty()) {
        
            System.out.println(s.peek());
            s.pop();
        }
    }

}
