package ex_25032025;

import javax.swing.*;
import java.util.Scanner;

public class lab050 {
    public static void main(String[] args) {
        // take user input and check if the number is even or odd
        // logic building
        // 1. figure out the inputs, 2. what data type
        // datatype - int
        // how to take input in java ? scanner - class-
        // nextInt() -> input
        // 3. do we need conversation or directly
        // 4. rough logic -> 10%2 = 0 is even otherwise odd
        // 5. optimize

        Scanner sc = new Scanner(System.in);// object of the scanner class
        System.out.println("enter the num");
        int user_input = sc.nextInt();
        System.out.println(user_input);

        if (user_input%2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
