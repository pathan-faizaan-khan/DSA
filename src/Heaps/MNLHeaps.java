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
                arr.set(x, par);
                arr.set(par, temp);
            }
        }
        public int peek() {
            return arr.get(0);
        }
    }
}
