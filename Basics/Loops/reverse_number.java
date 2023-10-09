public class reverse_number {
    public static void main(String args[]) {

        int num= 546783;

        while (num>0) {

            int lastdigit=num%10;

            System.out.print(lastdigit);

            num/=10;

            
        }
        
    }
    
}
