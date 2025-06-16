package Questions;
// Minimum Sum absolute difference pair
import java.util.Arrays;

public class JavaGreedyQ3 {
    public static void main(String args[]) {
        int arr[] = {1,2,3};
        int arr2[] = {2,1,3};

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int minabsolute = 0;
        for(int i =0; i<arr.length; i++) {
            minabsolute+= Math.abs(arr[i]- arr2[i]);
        }
        System.out.println(minabsolute);
    }
}
