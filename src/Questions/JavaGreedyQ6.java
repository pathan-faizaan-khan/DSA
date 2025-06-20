package Questions;
// Job sequencing Problem

import java.util.ArrayList;
import java.util.Collections;

public class JavaGreedyQ6 {

    static class jobs {
        int deadline;
        int profit;
        int id;

        public jobs(int d, int p, int i) {
            this.deadline = d;
            this.profit = p;
            this.id = i;
        }
    }

    public static void main(String args[]) {
        int works[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<jobs> job = new ArrayList<>();

        for(int i=0; i<works.length; i++) {
            job.add(new jobs(works[i][0], works[i][1], i));
        }

        Collections.sort(job, (a,b) -> b.profit-a.profit); 
        // desending order


        int time = 0;
        ArrayList<Integer> seq = new ArrayList<>();
        for(int i =0; i<job.size(); i++) {
            jobs curr = job.get(i);

            if(curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("total possible jobs "+ seq.size());

        for(int i=0; i<seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
    
}
