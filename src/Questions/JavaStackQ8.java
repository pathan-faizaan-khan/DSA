// Finding the area greater rectangle among histogram
package Questions;
import java.util.Stack;

public class JavaStackQ8 {
    public static void SmallRight(int[] arr,  int[] nextGreater) {
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {
            int curr = arr[i];
            while (!s.isEmpty() && curr <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = arr.length;
            } else {
                nextGreater[i] = s.peek();
            }
            s.push(i);
        }
    }   

    public static void SmallLeft(int[] arr,  int[] nextGreater) {
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            int curr = arr[i];
            while (!s.isEmpty() && curr <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = s.peek();
            }
            s.push(i);
        }
    }   
    public static void findGreaterRectangle(int[] hist, int[] result) {
        int maxArea = 0;
        // Small left -> i
        int[] SmallLeft = new int[hist.length];
        SmallLeft(hist, SmallLeft);
        int[] SmallRight = new int[hist.length];
        SmallRight(hist, SmallRight);

        for(int k = 0; k<hist.length; k++) {
            int currH = hist[k];
            int i = SmallLeft[k];
            int j = SmallRight[k];
            int currArea = currH * (j-i-1);
            result[k] = currArea;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("The Maximum Area is = " + maxArea);

    }
    public static void main(String args[]) {
        int[] hist = {2,1,5,6,2,3};
        int[] greatrec = new int[hist.length];

        findGreaterRectangle(hist, greatrec);

        for(int i = 0; i<greatrec.length; i++) {
            System.out.print(greatrec[i] + " ");
        }
       
    }
}
