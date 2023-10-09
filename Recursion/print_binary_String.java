public class print_binary_String {

    public static void main(String args[]){

        printBinString(3,"",0);

    }
    
    //n = index, 
    //str = string in which the values will be stored
    //lastplace = the last place number
    public static void printBinString(int n, String str, int lastPlace){

        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam
        //here we are starting with the 1 as last place
        printBinString(n-1,str+"0",0); 

        if(lastPlace == 0){
            printBinString(n-1,str+"1",1);
        }

    }
}
