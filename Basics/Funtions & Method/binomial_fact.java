public class binomial_fact {

    public static  int  fact(int num) {
        int fact = 1 ;
        while (num>1) {
            fact = fact*num;
            num--; }
       
            return fact;
       
         }
        
       public static int  binoFact(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        
        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff;
        
        
    }
    
        public static void main(String args[]) {
        
       
       
        System.out.println(binoFact(5, 2));


        
    }
    
}

      
    
