public class Static {

    public static void main(String args[]){

        Vidyarthi v1 = new Vidyarthi();

        v1.schoolName = "Mount carmel";

        Vidyarthi v2 = new Vidyarthi();
        System.out.println(v2.getter());

        Vidyarthi v3 = new Vidyarthi();

        v3.setter("GH Raisoni");
        System.out.println(v3.getter());

        


    }
    
}

class Vidyarthi{

    String name;
    int roll;

    static String schoolName;

    //setter
    void setter(String schoolName){
        this.schoolName = schoolName;
    }

    //getter
    String getter(){
        return this.schoolName;
    }
}