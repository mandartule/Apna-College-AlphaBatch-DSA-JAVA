public class permutations {
    public static void main(String args[]){
        
        String str = "abc";
        permutations(str,"");

    }

    public static void permutations(String str,String ans){

        //base case

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //work

        for(int i = 0; i < str.length(); i++){

            char curr = str.charAt(i);
            
            //removing that element from the temp String 

            /* "abcde"  and if at i = c then temp = "ab"+de*/
            String temp = str.substring(0,i)+str.substring(i+1);

            //if choice is yes
            permutations(temp,ans+curr);

           

        }
    }
    
}
