public class JavaLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int Data) {
            this.data = Data;
            this.next = null;
        }
    }

    public static Node tail;
    public static Node head;
    public static int Size;

    public void addFirst(int Data) {
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
            addFirst(data);
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

    public int removeFirst() {
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

    public int searchInLL(int key) {
        if (Size == 0) {
            return -1;
        }
        System.out.println("Got it");
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;

    }
    public int helper(Node head, int key) {
        if(head==null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if(idx == -1) {
            return -1;
        }

        return idx + 1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }

    public void revrse() {
        Node prev = null;
        Node curr = tail = head;
        Node Next;

        while (curr!=null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
            
        }

        head = prev;
    }

    public void DeleteNthFromEnd(int nth) {
        int Size =0;
        Node temp = head;
        while(temp!=null) {
            temp = temp.next;
            Size++;
        }

        if (nth == Size) {
            head = head.next;
            return;
        }
        int i =1;
        int nthindex = Size-nth;
        Node prev = head;
        while (i<nthindex) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean checkPallindromLL() {
        if(head==null || head.next==null) {
            return true;
        }

        Node midVal = findMid(head);

        Node prev = null;
        Node curr = midVal;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }

        Node right = prev;
        Node left = head;

        while (right!=null) {
            if(left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
            
        }

        return true;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                return true;
            }
        }

        return false;
    }

    public void cycleBroke() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // 1
            fast = fast.next.next; // 2

            if(slow == fast) {
                cycle = true;
                break;
            }
            
        }

        if(!cycle) {
            return;
        }

        slow = head;
        Node prev = null;

        while (slow!=fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    public static void main(String args[]) {
        JavaLinkedList ll = new JavaLinkedList();
        ll.addFirst(10);
        ll.addLast(10);
        ll.addFirst(5);
        ll.addMiddle(2, 100);
        tail.next = head.next;
        // System.out.println(tail.data);
        // ll.printList();clear
        // System.out.println(ll.removeFirst());
        // System.out.println(ll.removeLast());
        // ll.revrse();
        // ll.printList();
        // ll.DeleteNthFromEnd(3);
        // ll.printList();
        // System.out.println(ll.checkPallindromLL());
        // System.out.print(ll.recSearch(100));
        System.out.println(isCycle());
        ll.cycleBroke();
        System.out.println(isCycle());
        ll.printList();


    }
}
