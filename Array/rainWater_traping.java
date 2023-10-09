public class rainWater_traping {
    
    public static void trappedRainwater(int height [] ){

        int leftB [] = new int [height.length];
        int rightB [] = new int [height.length]; 

        //caluculate left max boundries of bar
        leftB [0] = height [0];
        for (int i = 1; i < height.length; i++) {
            
            leftB [i] = height [i-1];
            
        }

        //calculate right max boundries of bar
         rightB [height.length-1] = height [height.length-1];
        for (int i = 0; i < height.length-1; i++) {
            
            rightB [i] = height [i+1];
             

        }
        
        //waterLevel = min( leftmax bound, rightmax bound)
        
        for (int i = 0; i < rightB.length; i++) {
            
            
        }

        
        
        


    }


    public static void main(String args []){
        int heigth [] = {4, 2, 0, 6, 3, 2, 5};


    }
    
}
