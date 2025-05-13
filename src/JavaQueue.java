
// public class JavaQueue {
//     static class Queue {
//         static int[] arr;
//         static int Size;
//         static int Rear;
//         static int Front;
//         public Queue(int n) {
//             arr = new int[n];
//             Size = n;
//             Rear = -1;
//             Front = 0;
//         }
//         public static boolean isEmpty() {
//             return Rear == -1;
//         }

//         public static void add(int ele) {
//             if(Rear == Size-1) {
//                 System.out.println("Queue is full");
//                 return;
//             }

//             Rear++;
//             arr[Rear] = ele;
//             return;
//         }

//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             int x = arr[Front];

//             for(int i=0; i<Rear; i++) {
//                 arr[i] = arr[i+1];
//             }
//             Rear--;
//             return  x;
//         } 
//         public static int Peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return arr[Front];
//         }
//     }
//     public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.Peek());
//             q.remove();
            
//         }
//     }
// }



// public class JavaQueue {
//     static class Queue {
//         static int[] arr;
//         static int Size;
//         static int Rear;
//         static int Front;
//         public Queue(int n) {
//             arr = new int[n];
//             Size = n;
//             Rear = -1;
//             Front = -1;
//         }
//         public static boolean isEmpty() {
//             return Rear == -1 && Front == -1;
//         }
//         public static Boolean isFull() {
//             return (Rear + 1) % Size == Front;
//         }
//         public static void add(int ele) {

//             if(isFull()) {
//                 System.out.println("Queue is full");
//                 return;
//             }
//             //add first ele
//             if(Front == -1) {
//                 Front = 0;
//             }

//             Rear = (Rear +1) % Size;
//             arr[Rear] = ele;
//             return;
//         }

//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             int x = arr[Front];
//             if(Rear == Front) {
//                 Rear = Front = -1;
                
//             } else {
//                 Front = (Front +1) % Size;

//             }
//             return  x;
//         } 
//         public static int Peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return arr[Front];
//         }
//     }
//     public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);

//         while (!q.isEmpty()) {
//             System.out.println(q.Peek());
//             q.remove();
            
//         }
//     }
// }



//Implementing Queue using Linked List



// public class JavaQueue {
//     static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//         }
//     }
//     static class Queue {
//         static Node front = null;
//         static Node rear = null;
        
//         public static boolean isEmpty() {
//             return rear == null && front == null;
//         }
        
//         public static void add(int ele) {
//             Node newNode = new Node(ele);
//             if(front == null && rear == null) {
//                 front = rear  = newNode;
//             }
//             rear.next = newNode;
//             rear = newNode;
//         }

//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             int x = front.data;
//             if(rear == front) {
//                 front = rear = null;
//             } else {
//                front = front.next;
//             }
//             return  x;
//         }
//         public static int Peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return front.data;
//         }
//     }
//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while (!q.isEmpty()) {
//             System.out.println(q.Peek());
//             q.remove();
            
//         }
//     }
// }


import java.util.*;
public class JavaQueue {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        

        public boolean isEmpty() {
            
            return s1.isEmpty();
        }
        
        public void add(int ele) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(ele);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public  int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }
        public int Peek() {
            if(isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.Peek());
            q.remove();
            
        }
    }
}