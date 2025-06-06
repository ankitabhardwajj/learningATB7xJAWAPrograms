package ex_06062025;

public class lab110 {
    public static void main(String[] args) {
        int[][] matrix = {

                {1,34},
                {2,35},
                {3,36}
        };

        int row = matrix.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print("\t");

            }
            System.out.println();

        }
    }
}
