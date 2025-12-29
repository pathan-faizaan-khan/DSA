// Wordbreak problem

package Tries;
public class longest_substring {
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

    public static String ans = "";
    public static void longestS(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char)(i+'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }

                longestS(root.children[i], temp);

                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
               
    public static void main(String args[]) {
        String[] words = {"a","ap","app","appl","apple","apply"};

        for(int i = 0; i<words.length; i++) {
            Insert(words[i]);
        }

        longestS(root, new StringBuilder(""));

        System.out.println(ans);
    }
}
