import java.util.*;
public class valid_anagram {
    public static boolean anagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        HashMap <Character, Integer> map = new HashMap<>();

        for(int i =0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i =0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
                
            }else{
                return false;
            }
        }

        return map.isEmpty();
    }
    public static void main(String args[]){
        String s1 = "kneemandar", s2 = "keenmanda";
        
        System.out.println(anagram(s1,s2));
        

        
    }
}
