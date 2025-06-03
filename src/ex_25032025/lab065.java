package ex_25032025;

import java.util.Scanner;

public class lab065 {
    public static void main(String[] args) {
        // check if the number is +ve , -ve or zero

        Scanner sc = new Scanner(System.in);
        System.out.println("what is the number");
        int num = sc.nextInt();


        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }
}
