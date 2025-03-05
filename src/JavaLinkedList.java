public class JavaLinkedList {
    public static class Node
    {
        int data;
        Node next;
        public Node(int Data)
        {
            this.data = Data;
            this.next = null;
        }
    }
    public static Node tail;
    public static Node head;

    public void addFirst(int Data)
    {
        Node newNode = new Node(Data);

        if (head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head  = newNode;
    }
    public void addLast(int Data) {
        Node newNode = new Node(Data);

        if(head==null)
        {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void printList() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            
        }
        System.out.println("NULL");
    }
    public static void main(String args[]) {
        JavaLinkedList ll = new JavaLinkedList();
        ll.addFirst(10);
        ll.addLast(20);
        ll.addFirst(5);
        ll.addLast(30);
        ll.printList();

    }
}
