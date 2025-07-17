package BinaryTree;

import java.util.HashMap;
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
            // System.out.println(idx);
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

        public static int Height(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = Height(root.left);
            int rh = Height(root.right);

            return Math.max(lh, rh) + 1;
        }

        public static int count(Node root) { // TC -> O(n)
            if (root == null) {
                return 0;
            }

            int rc = count(root.right);
            int lc = count(root.left);

            return lc + rc + 1;
        }

        public static int SumOfNode(Node root) { // TC -> O(n)
            if (root == null) {
                return 0;
            }

            int leftSum = SumOfNode(root.left);
            int rightSum = SumOfNode(root.right);

            return leftSum + rightSum + root.data;

        }

        public static int Diameter2(Node root) {
            if (root == null) {
                return 0;
            }

            int leftDiameter = Diameter2(root.left);
            int RightDiameter = Diameter2(root.right);
            int leftH = Height(root.left);
            int rightH = Height(root.right);

            return Math.max(leftH + rightH + 1, Math.max(RightDiameter, leftDiameter));
        }

        public static class Info {
            int daim;
            int ht;

            public Info(int diam, int ht) {
                this.daim = diam;
                this.ht = ht;
            }
        }

        public static Info Diameter(Node root) { // O(n)
            if (root == null) {
                return new Info(0, 0);
            }

            Info rightD = Diameter(root.right);
            Info leftD = Diameter(root.left);

            int diameter = Math.max(leftD.daim, Math.max(rightD.daim, leftD.ht + rightD.ht + 1));
            int height = Math.max(leftD.ht, rightD.ht) + 1;

            return new Info(diameter, height);
        }

        public static boolean isIdentical(Node root1, Node root2) {
            if (root1 == null && root2 == null) {
                return true;
            } else if (root1 == null || root2 == null || root1.data != root2.data) {
                return false;
            }

            boolean leftI = isIdentical(root1.left, root2.left);
            boolean rightI = isIdentical(root1.right, root2.right);

            if (leftI && rightI) {
                return true;
            } else {
                return false;
            }

        }

        public static boolean subTree(Node root1, Node root2) {
            if (root1 == null) {
                return false;
            }
            if (root1.data == root2.data) {
                if (isIdentical(root1, root2)) {
                    return true;
                }
            }
            return subTree(root1.left, root2) || subTree(root1.right, root2);
        }
    }

    static class Infor {
        Node node;
        int hd;

        public Infor(Node node, int hd) {
            this.node = node;
            this.hd = hd;

        }
    }

    public static void TopView(Node root) {
        Queue<Infor> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        q.add(new Infor(root, 0));
        q.add(null);

        int max = 0, min = 0;

        while (!q.isEmpty()) {
            Infor curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
            if (curr != null) {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Infor(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Infor(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        System.out.println(min);
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void kthLevel(Node root, int level, int k) {

        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (leftLca == null) {
            return rightLca;
        }
        if (rightLca == null) {
            return leftLca;
        }

        return root;
    }

    public static int lcaDist(Node root, int n1) {
        if (root == null) {
            return -1;
        }

        if (root.data == n1) {
            return 0;
        }

        int leftD = lcaDist(root.left, n1);
        int RightD = lcaDist(root.right, n1);

        if (leftD == -1 && RightD == -1) {
            return -1;
        } else if (leftD == -1) {
            return RightD + 1;
        } else {
            return leftD + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);
        return lcaDist(lca, n1) + lcaDist(lca, n2);
    }

    public static int kAncestor(Node root, int n, int k) {
        if(root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = kAncestor(root.left, n, k);
        int righDist = kAncestor(root.right, n, k);

        if (leftDist == -1 && righDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, righDist);

        if(max+1 == k) {
            System.out.println(root.data);
        }

        return max+1;
    }

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        } 
        root.data = (root.left != null ? root.left.data : 0) + (root.right != null ? root.right.data : 0);

        transform(root.left);
        transform(root.right);
        
        return root.data;
    }
 
    public static void main(String args[]) {
        int[] values = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree Btree = new BinaryTree();
        Node root = Btree.buildTree(values);
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);
        // System.out.println(root.data);

        // Btree.preorder(root);
        // Btree.inorder(root);
        // Btree.postorder(root);
        // Btree.levelorder(root);

        // System.out.println(Btree.Height(root));
        // System.out.println(Btree.count(root));
        // System.out.println(Btree.SumOfNode(root));
        // System.out.println(Btree.Diameter2(root));
        // System.out.println(Btree.Diameter(root).daim);
        // Btree.preorder(root2);
        // System.out.println();
        // Btree.preorder(root.left);
        // System.out.println(Btree.subTree(root, root2));
        // TopView(root2);

        // kthLevel(root2, 1, 3);

        // System.out.println(lca(root2, 4, 5).data);

        // System.out.println(minDist(root2, 5, 5));
        // kAncestor(root, 5, 1);

        // transform(root2);
        Btree.levelorder(root2);
    }
}
