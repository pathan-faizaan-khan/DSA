package Questions;

public class JavaBinarySearchTreeQ3 {
    static class Node {
        Node right;
        Node left;
        int data;

        public Node(int data) {
            this.right =null;
            this.left = null;
            this.data = data;
        }
    }

    static class Info {
        int diff;
        Node croot;

        public Info(int diff, Node croot) {
            this.diff = diff;
            this.croot = croot;
        }
    }

    public static Info Cvalue(Node root, int k) {
        if (root == null) {
            return new Info(Integer.MAX_VALUE, root);
        }


        Info leftDiff = Cvalue(root.left, k);
        Info rightDiff = Cvalue(root.right, k);

        int diff = Math.abs(root.data - k);

        int finaldiff = Math.min(leftDiff.diff, Math.min(rightDiff.diff, diff));


        if (leftDiff.diff < rightDiff.diff) {
            return new Info(finaldiff, leftDiff.croot);
        } 
        if (rightDiff.diff < leftDiff.diff) {
            return new Info(finaldiff, rightDiff.croot);
        }

        return new Info(finaldiff, root);
    }

    public static void main(String args[]) {
        Node root = new Node(8);
        root.right = new Node(5);
        root.left = new Node(11);
        root.right.right = new Node(3);
        root.right.left = new Node(6);
        root.left.left = new Node(20);

        Info answer = Cvalue(root, 8);

        System.out.println("Root = "+ answer.croot.data+ " Diff = "+ answer.diff);

    }
}
