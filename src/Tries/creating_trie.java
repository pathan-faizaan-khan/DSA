// Wordbreak problem

package Tries;
public class creating_trie {
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

    public static boolean validS(String ms) {
               
        if (ms.length() == 0) {
            return true;
        }

        for (int i = 1; i<=ms.length(); i++) {
            if (search(ms.substring(0,i)) && validS(ms.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};

        for (int i = 0; i<words.length; i++) {
            Insert(words[i]);
        }

        String key = "ilikesamsung";

        System.out.println(validS(key));
        // System.out.println(search("thee"));
        // System.out.println(search("there"));
    }
}
