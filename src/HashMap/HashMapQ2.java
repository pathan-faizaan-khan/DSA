package HashMap;

import java.util.*;

public class HashMapQ2 {
    public static void main(String args[]) { // O(n)
        HashMap<Character, Integer> hm = new HashMap<>();
        String s1 = "Fish";
        String s2 = "ishF";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (hm.get(ch) == null) {
                hm.put(ch,1); //length
            } else {
                hm.put(ch, hm.get(ch)+1);
            }
        }

        for (int i = 0; i< s2.length(); i++) {
            char ch = s2.charAt(i);
            if (hm.get(ch) != null) {
                hm.remove(ch);
            }
        }

        System.out.println(hm.isEmpty());
    }
}