package Heaps;
import java.util.*;
public class MNLHeaps {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int v) {
            arr.add(v);

            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)) { // TC - O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x=par;
                par = (x-1)/2;
            }
        }
        public int peek() {
            return arr.get(0);
        }

        private void heapify(int idx) { // O(logn)
            int left = 2*idx+1;
            int right = 2*idx+2;
            int minidx = idx;

            if(left < arr.size() && arr.get(minidx) > arr.get(left)) {
                minidx = left;
            }

            if (right < arr.size() && arr.get(minidx) > arr.get(right)) {
                minidx = right;
            }

            if (minidx != idx) {
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minidx));
                arr.set(minidx, temp);
                heapify(minidx);
            }

        }

        public int remove() {
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            arr.remove(arr.size()-1);

            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() ==0;
        }
    }

    public static void main(String args[]) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
