public class Abstract_Classes {

    public static void main(String args[]) {

        Horse h1 = new Horse();
        System.out.println(h1.color);
        h1.walk();
        h1.eat();

        System.out.println();

        Hen p1 = new Hen();

        p1.changeColor();
        System.out.println(p1.color);
        p1.eat();
        p1.walk();

    }

}

abstract class Animal {

    String color;

    //this property will be common in all classes
    Animal() {
        color = "brown";
    }

    abstract void walk();
}

class Horse extends Animal{

    //now it is compulsory to use walk function

    void eat(){
        System.out.println("Eats grass");
    }

    void walk(){
        System.out.println("Walks on four legs");
    }

       
}

class Hen extends Animal{



    void eat(){
        System.out.println("Eats insects");
    }

    void walk(){

        System.out.println("Walks on 2 legs");
        
    }

    void changeColor(){
        color = "blue";
    }
}


