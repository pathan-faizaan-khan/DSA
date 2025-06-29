package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            Node newNode = new Node(nodes[idx]);
            if (nodes[idx] == -1) {
                return null;
            }

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }

            postorder(root.left);

            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelorder(Node root) {
            Queue<Node> que = new LinkedList<>();
            que.add(root);
            que.add(null);
            while (!que.isEmpty()) {
               Node currNode =  que.remove();
                if (currNode == null) {
                    System.out.println();
                    if(que.isEmpty()) {
                        break;
                    } else {
                        que.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null) {
                        que.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        que.add(currNode.right);
                    }
                }

            }
        }

        public static int Height(Node root) {
            if(root == null) {
                return 0;
            }

            int lh = Height(root.left);
            int rh = Height(root.right);

            return Math.max(lh, rh) + 1;
        }

        public static int count(Node root) {  // TC -> O(n)
            if(root == null) {
                return 0;
            }

            int rc= count(root.right);
            int lc = count(root.left);

            return lc + rc + 1;
        }

        public static int SumOfNode(Node root) {  // TC -> O(n)
            if(root == null) {
                return 0;
            }

            int leftSum = SumOfNode(root.left);
            int rightSum = SumOfNode(root.right);

            return leftSum + rightSum + root.data;

            
        }
    }

    public static void main(String args[]) {
        int[] values = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree Btree = new BinaryTree();

        Node root = Btree.buildTree(values);

        // System.out.println(root.data);


        // Btree.preorder(root);
        // Btree.inorder(root);
        // Btree.postorder(root);
        // Btree.levelorder(root);

        System.out.println(Btree.Height(root));
        System.out.println(Btree.count(root));
        System.out.println(Btree.SumOfNode(root));
    }
}
