package Questions;
import java.util.*;

public class JavaStackQ5 {
    public static void nextGreat(int[] arr,  int[] nextGreater) {
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {
            int curr = arr[i];
            while (!s.isEmpty() && curr > arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }   
    public static void main(String args[]) {
        int arr[] = {6,8,0,1,3};
        
        int nextGreater[] = new int[arr.length];

        nextGreat(arr, nextGreater);

        for(int i=0; i<nextGreater.length; i++) {
            System.out.println(nextGreater[i]);
        }

    }
}
