public class DoublyLL {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;  
        }
    }

    public static Node head;
    public static Node tail;
    public static int Size;


    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = tail = newNode;
            Size++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        Size++;

    }
    public int removeFirst() {
        if(head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if (Size==1) {
            int DL = head.data;
            head = tail = null;
            Size--;
            return DL;
        }
        int DL = head.data;
        head = head.next;
        head.prev = null;
        Size--;
        return DL;
    }

    public int removeLast() {
        if(head==null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if (Size==1) {
            int DL = head.data;
            head = tail = null;
            Size--;
            return DL;
        }
        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        int DL  = temp.next.data;
        temp.next.prev = null;
        temp.next = null;
        Size--;
        return DL;
        
    }
    public void reverse(){
        Node curr = head;
        Node prev = null; 
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next =  prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head  = prev;
    }

    public void printDLL() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
            
        }
        System.out.println("NULL\n");
    }

    public static void main(String args[]) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        // dll.printDLL();
        dll.removeFirst();
        // dll.printDLL();
        dll.removeLast();
        dll.printDLL();
        dll.reverse();
        dll.printDLL();

    }
}
