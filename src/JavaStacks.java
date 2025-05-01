import java.util.ArrayList;
public class JavaStacks {
    static class stack {
        ArrayList<Integer> list = new ArrayList<>();
        
        public  boolean isEmpty() {
            return list.size() == 0;
        }
        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.get(list.size()-1));

            return top;

        }

        public int peek() {
            return list.get(list.size()-1);
        }

    }

    public static void main(String args[]) {
        stack s1= new stack();
        s1.push(3);
        s1.push(2);
        s1.push(1);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
            
        }
    }
}
