public class Constructor_hierarchical_calling {

    public static void main(String args[]) {
        Minster m1 = new Minster();

        //hierarchy
        //president -> pm -> minister 

        
    }

}

class President {

    President() {
        System.out.println("President constructor is called");
    }
}

class PM extends President {

    PM() {
        System.out.println("PM consturctor is called");
    }
}

class Minster extends PM {

     Minster() {
        System.out.println("Minster constructor is called");
    }
}
