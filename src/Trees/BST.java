package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        if (root == null) {
            root = new Node(v);
            return root;
        }

        if (v < root.data) {
            root.left = Insert(root.left, v);
        } else {
            root.right = Insert(root.right, v);
        }

        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void search(Node root, int key) { // TC -> O(H)
        if (root == null) {
            System.out.println("key not found");
            return;
        }

        if (root.data == key) {
            System.out.println("Key found");
            return;
        }

        System.out.println(root.data);

        if (key < root.data) {
            search(root.left, key);
        } else {
            search(root.right, key);
        }

    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val) {

        if (val > root.data) {
            root.right = delete(root.right, val);
        } else if (val < root.data) {
            root.left = delete(root.left, val);
        } else {
            // Case 1 -> leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 -> single child
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            // case 3 -> two child

            Node IS = inorderSuccessor(root.right);

            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;

    }

    public static void levelorder(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        while (!que.isEmpty()) {
            Node currNode = que.remove();
            if (currNode == null) {
                System.out.println();
                if (que.isEmpty()) {
                    break;
                } else {
                    que.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    que.add(currNode.left);
                }
                if (currNode.right != null) {
                    que.add(currNode.right);
                }
            }

        }
    }
    public static void printList(ArrayList<Integer> list) {
        for(int val : list) {
            System.out.print(val + "->");
        }
        System.out.println("Null");
    }
    public static void printLeafPath(Node root, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }
        list.add(root.data);
        if(root.left == null && root.right == null) {
            printList(list);
        }

        printLeafPath(root.left, list);
        printLeafPath(root.right, list);

        list.remove(list.size()-1);


    }

    public static void printInRange(Node root, int k1, int k2) {
        if(root == null) {
            return;
        }

        if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data > k1) { 
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }

        if(min != null && root.data <= min.data) {
            return false;
        }

        else if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);

     }

    public static Node rootMirror(Node root) {
        if(root == null) {
            return root;
        }

        Node leftS = rootMirror(root.left);
        Node rightS = rootMirror(root.right);

        root.left = rightS;
        root.right = leftS;


        return root;
    }

    public static Node createBST(int[] arr,int strt,int end) {
        if (strt > end) {
            return null;
        }
        int mid = (strt + end)/2;

        Node root = new Node(arr[mid]);

        root.left = createBST(arr, strt, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }

    public static void Preorder(Node root) {
        if(root== null) {
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBalancedBST(ArrayList<Integer> inorder, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) /2;
        Node root = new Node(inorder.get(mid));

        root.left = createBalancedBST(inorder, start, mid-1);
        root.right = createBalancedBST(inorder, mid+1, end);

        return root;
    }
    public static Node balancedBST(Node root){

        ArrayList<Integer> inorder = new ArrayList<>(); // O(n)
        getInorder(root, inorder);

        root = createBalancedBST(inorder, 0, inorder.size()-1); // O(n)
        return root;
    }
    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }

        Node tree = new Node(8);
        tree.left = new Node(6);
        tree.left.left = new Node(5);
        tree.left.left.left = new Node(3);
        tree.right = new Node(10);
        tree.right.right = new Node(11);
        tree.right.right.right = new Node(12); 

        // Inorder(root);
        // Inorder(root);
        // root = delete(root, 1);
        // System.out.println();
        // Inorder(root);
        // System.out.println(root.left.data);
        // search(root, 2);

        // Inorder(root);
        // printInRange(root, 1, 5);
        
        // printLeafPath(root, new ArrayList<>());

        // System.out.println(isValidBST(root, null, null));

        // levelorder(root);
        // rootMirror(root);
        // System.out.println("---------------------------");
        // levelorder(root);
        // // Preorder(root);
        // Inorder(root);
        // int[] arr = {3,5,6,8,10,11,12};
        // Node newRoot = createBST(arr, 0, arr.length-1);
        // Inorder(newRoot);
        // Preorder(newRoot);

        Node tree2 = balancedBST(tree);

        Preorder(tree2);

    }
}
