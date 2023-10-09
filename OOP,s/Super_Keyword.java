public class Super_Keyword {

    public static void main(String args[]){

        Ghoda g1 = new Ghoda();
        


    }
    
}

class Prani{
    String color = "blue";
    
    
    Prani(){
        System.out.println("Prani constructor is called");
        System.out.println(color);
        
    }
}

class Ghoda extends Prani{
  Ghoda(){
    //this changes the properties of the previous class
    super.color = "black";
    System.out.println("Ghoda consturctor is called");
    System.out.println(color);
  }
}
