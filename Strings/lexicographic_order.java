public class lexicographic_order {

    public static void main(String args[]) {

        String fruit[]  = {"banana","apple","mango"};

        String largest = fruit[0];

        for(int i= 0; i<fruit.length; i++){

            if(fruit[i].compareTo(largest) > 0){

                largest = fruit[i];

            }

        }

        System.out.println(largest);
    }
    
}
