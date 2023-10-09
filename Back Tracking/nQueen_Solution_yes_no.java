public class nQueen_Solution_yes_no {

    public static void main(String args[]) {

        int n = 5;
        char board[][] = new char[n][n];

        // intializing the chess board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';

            }
        }

        if(pattern(board, 0)) {
            System.out.println("Solution is possible");
            System.out.println("------------");
            print(board);
        }
    

    }

    static int count = 0;

    public static boolean pattern(char board[][], int row) {

        // base case
        if (row == board.length) {
            count++;
            return true;
        }

        // work

        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                // reccursion
                if(pattern(board, row + 1)){
                    return true;
                }
                board[row][j] = '.'; // backtrack

            }

        }

        return false;

    }

    public static boolean isSafe(char board[][], int row, int col) {

        // we need to check is there any queen we have set above that can come in
        // killing area

        // verticall above cheking
        /*
         * we just take for loop going up therfore same coloum but row -1 in each loop
         */

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // left digonaly above
        /* going up by one step and left by one step */
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }

        }

        // right digonaly above
        /* going up by one step and right by one step */

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void print(char arr[][]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
    }

}
