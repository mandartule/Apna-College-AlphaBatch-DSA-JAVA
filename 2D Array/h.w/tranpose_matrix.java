public class tranpose_matrix {

    public static void tranpose(int matrix[][]) {

        int row = matrix.length;
        int col = matrix[0].length;

        int tranpose[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                tranpose[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {

                System.out.print(tranpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int matrix[][] = {
                { 2, 3, 7 },
                { 5, 6, 7 },
                { 4, 5, 6 }
        };

        // printing orignal matrix

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // printing tranpose matrix
        tranpose(matrix);

    }

}
