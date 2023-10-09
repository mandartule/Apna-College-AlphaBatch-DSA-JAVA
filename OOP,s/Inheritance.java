public class Inheritance {

    public static void main(String args[]) {

        Fish shark = new Fish();

        // inherited properties
        shark.skinColor = "blue";
        shark.eat();

        // self properties
        shark.fins = 5;

        Mamals whale = new Mamals();

        whale.skinColor = "black";
        whale.eat();

    }
}

// main class or parent class

class Animals {

    String skinColor;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breath");
    }
}

// derived class or child class

// Single inherited class

class Fish extends Animals {

    int fins;

    void swim() {
        System.out.println("Swims");
    }
}

// Double inherited class
class Mamals extends Fish {

    int milk;

    String size;

}