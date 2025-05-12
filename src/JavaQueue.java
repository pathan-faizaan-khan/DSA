
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



public class JavaQueue {
    static class Queue {
        static int[] arr;
        static int Size;
        static int Rear;
        static int Front;
        public Queue(int n) {
            arr = new int[n];
            Size = n;
            Rear = -1;
            Front = -1;
        }
        public static boolean isEmpty() {
            return Rear == -1 && Front == -1;
        }
        public static Boolean isFull() {
            return (Rear + 1) % Size == Front;
        }
        public static void add(int ele) {

            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }
            //add first ele
            if(Front == -1) {
                Front = 0;
            }

            Rear = (Rear +1) % Size;
            arr[Rear] = ele;
            return;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = arr[Front];
            if(Rear == Front) {
                Rear = Front = -1;
                
            } else {
                Front = (Front +1) % Size;

            }
            return  x;
        } 
        public static int Peek() {
            if(isEmpty()) {
                return -1;
            }
            return arr[Front];
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.Peek());
            q.remove();
            
        }
    }
}
