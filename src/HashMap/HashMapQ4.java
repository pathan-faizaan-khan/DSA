// Solved Itenary for tickets


package HashMap;
import java.util.HashMap;
public class HashMapQ4 {

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }
    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Delhi", "Goa");
        tickets.put("Chennai", "Bangluru");
        tickets.put("Goa", "Chennai");
        tickets.put("Mumbai", "Delhi");

        String start = getStart(tickets);

        System.out.print(start);


        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }

    }
}
