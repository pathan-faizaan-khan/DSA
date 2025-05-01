public class JavaLLQuestions {
    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int Size;

    public void addlast(int Data) {
        Node newNode = new Node(Data);
        Size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int Data) {
        Node newNode = new Node(Data);
        Size++;

        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("NULL");
    }

    public void addMiddle(int idx, int data) {

        if (idx == 0) {
            addlast(data);
            return;
        }
        Node newNode = new Node(data);
        Size++;

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removelast() {
        if (Size == 0) {
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;
        } else if (Size == 1) {
            int val = head.data;
            head = tail = null;
            Size = 0;
            return val;
        }
        int val = head.data;

        head = head.next;
        Size--;

        return val;
    }

    public int removeLast() {
        if (Size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;

        } else if (Size == 1) {
            int val = head.data;
            head = tail = null;
            Size = 0;
            return val;
        }

        Node temp = head;

        for (int i = 0; i < Size - 2; i++) {
            temp = temp.next;

        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        Size--;
        return val;
    }

    public static void main(String args[]) {
        Node head1, head2;
        head1 = new Node(10);

        head2 = new Node(3);
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
    }
}
