public class bin_to_decimal {

    public static void bintodeci(int num1) {
        int myNum=num1;
        int pow=0;
        int decNum=0;

        while (num1>0) {
            int lastdigit=num1%10;
            decNum=decNum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            num1=num1/10;
        }
        System.out.println("decimal number of "+myNum+" is : "+decNum);
        
    }

    public static void main(String args[]) {
        bintodeci(111);
    }

    
}
