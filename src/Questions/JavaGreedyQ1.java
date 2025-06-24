package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// Actvity Selections
public class JavaGreedyQ1 {
    public static void main(String args[]) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int activity[][] = new int[end.length][3];

        for(int i = 0; i<end.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        maxAct = 1;
        ans.add(activity[0][0]);
        int lastEnd = activity[0][2];
        
        for(int i= 1; i<end.length; i++) {
            if(lastEnd <= activity[i][1]) {
                maxAct++;
                ans.add(activity[i][0]);
                lastEnd = activity[i][2];
            }

        }

        System.out.println("Maximum number of activity possible " + maxAct);
        for(int i =0; i<ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
