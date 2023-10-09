public class vovels_count {

    public static void count(String str){
        
        int count = 0;
        for(int i =0; i <str.length(); i++){
            if(str.charAt(i) != Character.toUpperCase(str.charAt(i))){
                count ++;
            }
        }

        System.out.println(count);

    }

    public static void main(String args[]){
        String str = "MAGhhghJKJ";
        count(str);

    }
    
}
