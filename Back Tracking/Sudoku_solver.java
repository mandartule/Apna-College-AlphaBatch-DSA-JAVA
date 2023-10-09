public class Sudoku_solver {

    public static void main(String args[]){
        int sudoku [][] = { 
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
            };

            if(solver(sudoku,0,0)){
                System.out.println("Solution exists");
                print(sudoku);
            }
            else{
                System.out.print("No Solution");
            };
    }

    public static boolean isSafe(int sudoku[][],int row, int col, int digit){

        //checking in row 

        for(int i = 0; i<=8; i++){
            if(sudoku[row][i] == digit){
                return false;
            }
        }


        // checking in col
        for(int i =0; i<= 8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        // checking in grid
        /*for this we should know the starting row and starting col of the grid 
         they have their own formula
        */

        int Srow = (row/3)*3;
        int Scol = (col/3)*3;

        for(int i = Srow; i< Srow+3; i++){
            for(int j = Scol; j< Scol+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean solver(int sudoku[][],int row,int col){

        //base case

        if(row == 9 ){
            return true;
        }
        
        //recursion

        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextCol = 0;
            nextRow = row+1;
        }

        //if  there already exists a number the 
        if(sudoku[row][col] != 0){
            return solver(sudoku,nextRow,nextCol);
        }


        for(int digit = 1; digit<=9; digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;

                if(solver(sudoku,nextRow,nextCol)){ //solution exists
                    return true;
                }
                //else case
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int sudoku[][]){
        for(int i = 0; i<=8; i++){
            for(int j = 0; j<= 8; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
