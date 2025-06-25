// Chocola Problem
package Questions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class JavaGreedyQ7 {
    public static void main(String args[]) {
        Integer[] horizontal = { 4, 1, 2 };
        Integer vertical[] = { 2, 1, 3, 1, 4 };
        Arrays.sort(vertical, Collections.reverseOrder());
        Arrays.sort(horizontal, Collections.reverseOrder());
        int cost = 0;
        int vp = 1, hp = 1;
        int vpoint = 0, hpoint = 0;

        while (vpoint < vertical.length && hpoint < horizontal.length) {
            if (vertical[vpoint] >= horizontal[hpoint]) {
                cost += hp * vertical[vpoint];
                vp++;
                vpoint++;
            } else {
                cost += vp * horizontal[hpoint];
                hp++;
                hpoint++;
            }

        }
        while (hpoint < horizontal.length) {
            cost += vp * horizontal[hpoint];
            hp++;
            hpoint++;
        }

        while (vpoint < vertical.length) {
            cost += vp * horizontal[hpoint];
            hp++;
            hpoint++;
        }

        System.out.println("Total minimum cost = " + cost);

    }
}
