package HashMap;
import java.util.*;
public class HashMapQ3 {
    public static void main(String args[]) {
        int[] set1 =  {4,5,2,1,3};
        int[] set2 =  {6,7,2,4,3};
        int union = 0;
        int intersec = 0;

        HashSet<Integer> hm1 = new HashSet<>();
        HashSet<Integer> hm2 = new HashSet<>();
        HashSet<Integer> hm3 = new HashSet<>();


        for (int i = 0; i < set1.length; i++) {
            hm1.add(set1[i]);
        }
        for (int i = 0; i < set2.length; i++) {
            hm2.add(set2[i]);
        }

        for (Integer ele : hm1) {
            hm3.add(ele);
        }
        for (Integer ele : hm2) {
            hm3.add(ele);
        }
        union = hm3.size();


        for (Integer ele : hm1) {
            if (hm2.contains(ele)) {
                intersec++;
                hm2.remove(ele);
            }
        }

        System.out.println(union);
        System.out.println(intersec);

    }
}
