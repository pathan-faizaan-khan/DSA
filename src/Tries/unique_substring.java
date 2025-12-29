// Wordbreak problem

package Tries;
public class unique_substring {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }   
    public static Node root = new Node();


    public static void Insert(String word) {
        Node curr = root;
        for (int i = 0; i< word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    public static int countS(Node root) {
        if (root == null) {
            return 0;
        }
        int count  = 0;
        for(int i = 0; i<26; i++) {
            if(root.children[i] != null) {
                count += countS(root.children[i]);
            }
        }
        return count+1;
    }
    
   

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i< key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
               
    public static void main(String args[]) {
        String str = "ababa";

        for (int i = 0; i<str.length(); i++) {
            Insert(str.substring(i));
        }

        System.out.println(countS(root));
    }
}
