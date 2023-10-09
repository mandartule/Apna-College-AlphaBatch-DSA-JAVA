public class deci_to_binary {

    private static void binNum(int num) {
        
        int myNum=num;
        int binNum =0;
        int pow = 0;
        while(num>0){
            
            binNum=binNum+(num%2)*(int)Math.pow(10,pow);
            pow++;
            num=num/2;
        }
        System.out.println("The binary number of "+myNum+" is : "+binNum);
    }

    public static void main(String args[]) {

        binNum(999);
        
        
    }


    
}
