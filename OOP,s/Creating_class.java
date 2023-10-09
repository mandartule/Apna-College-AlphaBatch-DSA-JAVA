public class Creating_class {
    public static void main(String args[]){

        //creating a pen object called p1
        Pen p1 = new Pen();

        p1.setColor("Blue");

        p1.size(5);

        System.out.println(p1.color);
        System.out.println(p1.tip);



    }
    
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void size(int newTip){
        tip = newTip;
    }
}