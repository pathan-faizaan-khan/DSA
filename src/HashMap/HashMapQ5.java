// Largest SubArray with sum = 0

package HashMap;
import java.util.HashMap;
public class HashMapQ5 {
    public static void main(String args[]) {
        HashMap<Integer, Integer> hm  = new HashMap<>();
        int[] arr = {15,-2,2,-8,1,7,10,23};

        int sum = 0;
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (hm.containsKey(sum)) {
                len = Math.max(len, i-hm.get(sum));
            } else {
                hm.put(sum, i);
            }
        }

        System.out.println("The length of largest subArray equals to 0 => "+ len);
    }
}
