package HashMap;
import java.util.*;
import java.util.Map.Entry;
public class concept {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 2300);
        hm.put("US", 1300);
        hm.put("Indonesia", 500);
        hm.put("Nepal", 2);
        hm.put("Europe", 300);
        hm.put("China", 10);


        for (Entry k : hm.entrySet()) {
            System.out.println(k);
        }
    }
}
