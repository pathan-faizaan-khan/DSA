package Questions;
import java.util.*;

public class JavaStackQ2 {
    
    public static void main(String args[]) {
        Stack<String> s = new Stack<>();

        s.push("a");
        s.push("b");
        s.push("c");

        // ReverseStack(s);
        StringBuilder sb = new StringBuilder("");

        while (!s.isEmpty()) {
            sb.append(s.pop());

        } 
        System.out.println(sb.toString());

    }
}
