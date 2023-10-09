public class Access_Modifiers {

    public static void main(String args[]){

        BankAcc myacc = new BankAcc();

        //public class
        System.out.println(myacc.name);

        //private class therefore it is showing error

       /* System.out.println(myacc.atmPin); */ 

        //but we can change the elements of private class by using a public function made to change it 

        myacc.setPin(9999);
    }
    
}

class BankAcc{

    private int atmPin = 1234;
    public String name = "mandar";

    public void setPin(int newPin){
        atmPin = newPin;

    }


}
