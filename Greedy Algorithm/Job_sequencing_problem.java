import java.util.*;
public class Job_sequencing_problem {
    
    static class Job{//this will contain blue print 
        int deadline;
        int profit;
        int id; //1,2,3

        //constructor
        public Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;

        }
    }
    public static void main(String args[]){
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        //so here we will make a arrayList of object jobs
        //for that make a job class

        ArrayList<Job> jobs = new  ArrayList<>();

        for(int i = 0; i<jobsInfo.length; i++){
            //adding each job in the arrayList as an object
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        //sorting the jobs on the basis of their profit
        Collections.sort(jobs, (obj1 , obj2) -> obj2.profit-obj1.profit); 
        //sorted in decending manner so obj2-obj1
        //if want in accending then obj1-obj2

        //making a new ans arrayList

        ArrayList <Integer> seq = new ArrayList<>();
        int time = 0;

        for(int  i =0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }   

        //max jobs
        System.out.println("max jobs = "+seq.size());
        //print seq
        for(int i = 0 ; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();

    }
}
