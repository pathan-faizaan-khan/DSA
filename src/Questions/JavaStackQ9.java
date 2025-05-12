package Questions;
import java.util.*;

public class JavaStackQ9 {

    public static boolean isPallindrome(LinkedList<Character> ll) {
        Stack<Character> s = new Stack<>();

        // Pushing The LL data in the Stack
        for(int i =0; i<ll.size(); i++) {
            s.push(ll.get(i));
        }
        
        // Comparing for pallindrome

        for(int i=0; i<ll.size(); i++) {
            if(s.pop()!=ll.get(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        LinkedList<Character> ll = new LinkedList<>();

        ll.add('c');
        ll.add('s');
        ll.add('C');
        ll.add('B');
        ll.add('j');

        System.out.println(isPallindrome(ll));


    }

}