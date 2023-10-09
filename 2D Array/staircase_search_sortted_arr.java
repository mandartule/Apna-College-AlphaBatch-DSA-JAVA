public class staircase_search_sortted_arr {
    // we are starting search from "Right Upper Corner"
    public static boolean staircase_Search_upperRight(int matrix[][], int key) {

        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.print("Key found at (" + row + "," + col + ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            }

            else {
                row++;
            }
        }

        System.out.print("Key is not present in MATRIX");
        return false;

    }

    // As a homework
    // here we are starting serch from bottom left corner
    public static boolean staircase_Search_bottomLeft(int matrix[][], int key) {

        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix[0].length) {

            if (key == matrix[row][col]) {
                System.out.print("Key found at (" + row + "," + col + ")");
                return true;
            }

            else if(key < matrix[row][col]){
                row--;
            }

            else{
                col++;
            }
        }

        System.out.print("Key not found !");
        return false;
    }

    public static void main(String args[]) {

        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int key = 40;
        staircase_Search_bottomLeft(matrix, key);

        

        

    }

}
