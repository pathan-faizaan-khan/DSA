package HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Delhi");
        hs.add("Hyderabad");
        hs.add("Mumbai");
        hs.add("Kolkata");

        Iterator it = hs.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String city : hs) {
            System.out.println(city);
        }
        
    }   

}
