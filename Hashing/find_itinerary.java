import java.util.*;
public class find_itinerary {

    public static String getStart(HashMap<String,String> tickets){

        //we will make a reverse hashMap
        HashMap<String,String> revMap = new HashMap<>();

        for(String i : tickets.keySet()){
            revMap.put(tickets.get(i), i);
        }

        for(String i : tickets.keySet()){
            if(!revMap.containsKey(i)){
                return i; //starting point
            }
        }

        return null;
    }
    public static void main(String args[]){
        HashMap<String,String> tickets = new HashMap<>();

        tickets.put("chennai","bengluru");
        tickets.put("Mumbai","delhi");
        tickets.put("goa","chennai");
        tickets.put("delhi","goa");

        String start = getStart(tickets);

        System.out.print(start); //printing intial starting point

        for(String key : tickets.keySet()){
            System.out.print("-->"+tickets.get(start)); // printing the value 
            start = tickets.get(start);
        }



    }
}
