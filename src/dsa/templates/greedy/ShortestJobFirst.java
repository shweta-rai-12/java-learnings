package dsa.templates.greedy;

import java.util.Arrays;

public class ShortestJobFirst {

    /**
     * Shortest Job First : It is a scheduling algorithm that selects
     * the process with the smallest execution time to execute next.
     * @return
     */
    public static int sjf(int[] jobs){
        int t =0;
        int[] job = Arrays.stream(jobs).sorted().toArray();
        for(int i=0;i<job.length;i++){
            t+=jobs[i];
        }
        return Math.round((float) t /jobs.length);
    }

    public static void main (String[] args) {
        System.out.println("Shortest Job First");
        int[] jobs = {3,1,2,5,4};
        System.out.println("The order of execution of jobs: "+sjf(jobs));
    }
}
