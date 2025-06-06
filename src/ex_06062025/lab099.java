package ex_06062025;

import java.util.Scanner;

public class lab099 {
    public static void main(String[] args) {
        // another way to create array is by using new keyword
        int [] marks= new int[8];
        // length= 8
        // index= 0,1,2,3,4,5,6,7
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        // as no value is assigned
        //default value is 0
        // after assigning ->
        marks[0]= 91;
        marks[1]= 92;
        marks[2]= 93;
        marks[3]= 94;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        // we can even assign values using scanner
        // by assigning on other values
        Scanner sc = new Scanner(System.in);
        marks[4]= sc.nextInt();
        marks[5]= 96;
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        // in this, it waits for the input
        // if we pu exception case in the starting nothing will run
        // like marks[10]= which is an exception

        boolean[] is_married = {true,false,false};

        for (int i = 0; i < marks.length; i++) {
            System.out.println(i+"->"+ marks[i]);

        }



    }
}
