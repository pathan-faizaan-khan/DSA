package Questions;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueueQ3 {
    public static void interLeave(Queue<Integer> q) {
        int size = q.size()/2;
        Queue<Integer> fq = new LinkedList<>();
        for(int i = 0; i<size; i++) {
            fq.add(q.remove());
        }
        while (!fq.isEmpty()) {
            q.add(fq.remove());
            q.add(q.remove());
        }
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        for(int i =1; i<=10; i++) {
            q.add(i);
        }
        interLeave(q);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
