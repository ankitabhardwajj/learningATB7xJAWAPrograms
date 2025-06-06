package ex_06062025;

public class lab109 {
    public static void main(String[] args) {
        int [][] array_2d = {
                {23,34,32},
                {56,12,22},
                {89,45,56}
        };


        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print(" ");
            }
            System.out.println();


            
        }
    }
}
