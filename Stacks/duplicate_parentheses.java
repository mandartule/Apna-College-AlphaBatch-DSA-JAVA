import java.util.*;
public class duplicate_parentheses {

    public static boolean check(String str){
        Stack <Character> s = new Stack<>();

        //we are given a valid string 
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing taking this because stack works reverse manner
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplilcate present
                }else{
                    s.pop();
                }

            }else{ //opening conditon
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]){
        String str = "((a+b))"; //true duplicate parentheses present
        String str2 = "((a)-(b))"; //false no duplicate
        
        System.out.println(check(str2));
    }
    
}
