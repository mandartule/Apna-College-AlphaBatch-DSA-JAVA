import java.util.*;
public class Max_length_chain_pairs {

    public static void main(String args[]){

        int pairs [][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        //sorting the pairs
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // sorting on the basis of the second coloum

        int chainLength = 1;//because its sure there will one element in the chain
        int chainEnd = pairs[0][1];
        for(int i = 1; i< pairs.length; i++){
            if(chainEnd<pairs[i][0]){
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println(chainLength);
    }
    
}
