public class subsets {

    public static void main(String args[]){

        String str = "abc";
        String ans = "";

        subsets(str,ans,0);
    }

    public static void subsets(String str,String ans,int i){
        
        //base case

        if(i == str.length()){

            //for empty string 
            if(ans.length() == 0){
                System.out.println("null");
                return;
            }else{
                    System.out.println(ans);
                    return;
                }

               
        }

        //work
        //if the choice is YES then the charecter will be added in the string

        subsets(str,ans+str.charAt(i),i+1);

        //backtraking
        //if the choice is no then the character will not be added but the index will be forward

        subsets(str,ans,i+1);
    }
    
}
