public class rainWater_traping {

    // water volume = [Water level - bar height]* width(that is 1
    // therefore no need to multiply)

    public static int trappedWater(int bars[]){

        //number of bars

        int n = bars.length;
        // water = Water trapped on that bar
        int water = 0, left = 0, right = n-1;
        int rightMax = bars[0], leftMax = bars[0];

        while( left < right){

            if(leftMax<rightMax){
                left++;
                
                leftMax = Math.max(leftMax,bars[left]);

                 
            }
        }




        return 0;
    }


    public static void main(String args[]){

        int bars[] ={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

    }
    
}
