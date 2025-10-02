package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQeue {

    static class Student implements Comparable<Student> {
        String name;
        int Rank;

        public Student(int Rank, String name) {
            this.Rank = Rank;
            this.name = name;
        }

        @Override
        public int compareTo(Student s2) {
           return this.Rank - s2.Rank;
        }
    }
    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(6, "A"));
        pq.add(new Student(3, "B"));
        pq.add(new Student(1, "C"));
        pq.add(new Student(12, "D"));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + " Rank : "+pq.peek().Rank);
            pq.remove();
        }
    }
}
