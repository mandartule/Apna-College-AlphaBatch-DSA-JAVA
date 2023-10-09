public class DSA_Rainwater_Trapping {

    public static int trappedRainWater(int bars[] ){
        int n = bars.length;
        //Calculate left max boundry 
        int leftMax[] = new int[n];
        leftMax [0] = bars [0];
        
        for(int i = 1; i< n; i++){
            leftMax [i] = Math.max(bars[i],leftMax[i-1]); 
            
        }
       
        //calculate right max bondry
        int rightMax[] = new int[n];
        rightMax[n-1] = bars[n-1];

        for(int i = n-2; i>=0 ; i--){
            rightMax [i] = Math.max(bars[i],rightMax[i+1]);
        }

        
        
        int trappedWater = 0;
        //loop
        for(int i=0; i<n;i++){
            //calculate min(left,right) = water level
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water  = water level - height
        
            trappedWater += waterLevel - bars[i];
        }
        
        return trappedWater;
    }



    public static void main(String args[]){

        int bars[] ={4,2,0,6,3,2,5};
        
        
        System.out.println(trappedRainWater(bars));


    }
    
}
