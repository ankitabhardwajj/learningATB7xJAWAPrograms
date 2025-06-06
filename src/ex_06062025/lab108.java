package ex_06062025;

public class lab108 {
    public static void main(String[] args) {
        // single dimensional array
        // have only one dimension,representing a list of elements
        int[] marks = {12,15,19};
        int[] marks2 = new int[5];


        // multidimensional array
        // have one or more dimensions,representing a table or a grid of elements
        // 2D,3D,4D

        int[][] array_2d = new int[3][3];
        // first is for row and 2nd for column
        // |0|0|0|
        // |0|0|0|
        // |0|0|0|
        array_2d[0][0]= 23; // 0 row and 0 column
        // it works as 0,1,2 for i
        // |23|0|0|
        // |0|0|0|
        // |0|0|0|
        array_2d[2][1]= 4; //2nd row and 1at column
        // |23|0|0|
        // |0|0|0|
        // |0|4|0|
    }
}
