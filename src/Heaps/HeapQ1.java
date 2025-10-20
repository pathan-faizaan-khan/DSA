package Heaps;
import java.util.*;

public class HeapQ1 {

    static class point implements Comparable<point>{
        int x;
        int y;
        int disSqrt;
        int idx;

        public point(int x, int y, int disSqrt, int idx) {
            this.x = x;
            this.y = y;
            this.disSqrt = disSqrt;
            this.idx = idx;
        }

        @Override
        public int compareTo(point s2) {
           return this.disSqrt - s2.disSqrt;
        }

    }
    public static void main(String args[]) {
        int pts[][] = {{3,3}, {5,-1}, {-2,4}};
        int k=2; 
        PriorityQueue<point> pq = new PriorityQueue<>();
        for(int i = 0; i<pts.length; i++) {
            int disSqrt =  pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0], pts[i][1], disSqrt, i));
        }

        for(int i=0; i<k; i++) {
            System.out.println(pq.remove().idx);
        }
    }
} 
