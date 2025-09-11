package Questions;

public class JavaBinarySearchTreeQ1 {
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

    public static class Info {
        boolean isBST;
        Integer max;
        int min;
        int Size;

        public Info(boolean isBST, int Size, int max, int min) {
            this.isBST = isBST;
            this.Size = Size;
            this.max = max;
            this.min = min;
        }

    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        Info leftTree = largestBST(root.left);
        Info rightTree = largestBST(root.right);
        int Size = leftTree.Size + rightTree.Size + 1;
        int min = Math.min(root.data, Math.max(leftTree.min, rightTree.min));
        int max = Math.max(root.data, Math.max(leftTree.max, rightTree.max));

        if (leftTree.max >= root.data || rightTree.min <= root.data) {
            return new Info(false, Size, max, min);
        }

        else if (leftTree.isBST && rightTree.isBST) {
            maxBST = Math.max(maxBST, Size);

            return new Info(true, Size, max, min);
        }

        return new Info(false, Size, max, min);

    }

    public static void main(String args[]) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.right = new Node(70);
        root.right.left = new Node(45);
        root.right.right.right = new Node(80);
        root.right.right.left = new Node(65);

        Info info = largestBST(root);
        System.out.println(maxBST);
    }

}
