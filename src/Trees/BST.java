package Trees;
public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static Node Insert(Node root, int v) {
        if(root == null) {
           root = new Node(v);
           return root;
        }

        if(v < root.data) {
            root.left = Insert(root.left, v);
        } else {
            root.right = Insert(root.right, v);
        }

        return root;
    }

    public static void Inorder(Node root) {
        if(root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void search(Node root, int key) { // TC -> O(H)
        if(root == null) {
            System.out.println("key not found");
            return;
        }

        if (root.data == key) {
            System.out.println("Key found");
            return;
        }

        System.out.println(root.data);

        if(key < root.data) {
            search(root.left, key);
        } else {
            search(root.right, key);
        }
        
    }
    public static void main(String args[]) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i =0 ; i < values.length ; i++) {
            root = Insert(root, values[i]);
        }

        // Inorder(root);
        // System.out.println(root.left.data);
        search(root, 2);

    }
}
