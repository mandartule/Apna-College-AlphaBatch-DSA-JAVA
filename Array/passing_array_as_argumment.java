public class passing_array_as_argumment {
    public static void update_array(int marks[], int nonChangeable){

        nonChangeable+=10;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] +1;

        }

    }

    public static void main(String args[]) {
        int marks[] = {97,98,99};

        int nonChangeable = 5;
    
        update_array(marks, nonChangeable);
        

        System.out.print(marks[0]+" ");
        System.out.print(marks[1]+" ");
        System.out.println(marks[2]+" \n");
    
        System.out.print(nonChangeable);
    }
    
}
