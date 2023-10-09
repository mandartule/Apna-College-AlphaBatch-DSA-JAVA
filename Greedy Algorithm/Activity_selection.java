import java.util.*;

public class Activity_selection {
    public static void main(String args[]){
        int start [] = {1,3,0,5,8,5};
        int end [] = {2,4,6,7,9,9};
        
        //sorting end time wise
        /*here we are using a 2D array sort */

        // a table of 3 coloums 
        /* 
         1st coloum will save the index of the number
         2nd coloum Will save start 
         3rd will save the end so
         we will sort by 3rd coloum
         */
        int activities[][] = new int[start.length][3];
        for(int i = 0; i< start.length; i++){
            activities[i][0] = i; //index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        
        //lambda function -> sortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); //here 2 is showing coloum no. three

        //end time basis soted

        int maxAct = 0;
        ArrayList <Integer> ans = new ArrayList<>();

        //1at activity
        maxAct = 1;//because at list one activity will be performed
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i = 0; i<end.length; i++){
            if(activities[i][1]>= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        
        System.out.println("Max actvity = "+maxAct);
        for(int i = 0; i< ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
    
}
