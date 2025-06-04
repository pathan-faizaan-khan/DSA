// Fractional Knapsack

package Questions;

import java.util.Arrays;
import java.util.Comparator;

public class JavaGreedyQ2 {
    public static void main(String args[]) {
        int[] weight = {10,20,30};
        int[] value = {60,100,120};
        int w = 50;
        double[][] ratio = new double[value.length][2];

        for(int i = 0; i<value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double)value[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int results = 0;
        for(int j = ratio.length-1; j>=0; j--) {
            int i = (int)ratio[j][0];
            if(capacity >= weight[i]) {
                 results += value[i];
                 capacity-= weight[i];
            } else {
                results += ratio[j][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("The maximum value can be fit in the Knapsack is "+results);
    }
}
