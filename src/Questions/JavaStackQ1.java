package Questions;
import java.util.Stack;

public class JavaStackQ1 {

    public static void pushAtBottom(Stack<Integer> s, int b) {
        if(s.isEmpty()) {
            s.push(4);
            return;
        }

        int top = s.pop();

        pushAtBottom(s, b);

        s.push(top);
    }
   public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        pushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
   }
}
