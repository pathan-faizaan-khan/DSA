package Questions;

import java.util.ArrayList;


public class JavaBinarySearchTreeQ2 {
    
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

    public static void Inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        Inorder(root.left, arr);
        arr.add(root.data);
        Inorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int strt, int end) {
        if (strt > end) {
            return null;
        }
        int mid = (strt + end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, strt, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }
    public static Node mergeBST(Node root1, Node root2) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        Inorder(root2, arr2);
        Inorder(root1, arr1);

        int i =0;
        int j= 0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {

            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;

            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
            
        }
        
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;     
        }

        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        return createBST(finalArr, 0, finalArr.size()-1);
    }

    public static void Preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void main(String args[]) {
        // BST 1

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);


        // BST 2

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);


        Node mergeBST = mergeBST(root1, root2);

        Preorder(mergeBST);


    }

}
