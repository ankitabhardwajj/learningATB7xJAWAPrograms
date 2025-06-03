package ex_25032025;

import java.util.Scanner;

public class lab070 {
    public static void main(String[] args) {
        // leap year 2024

        Scanner sc = new Scanner(System.in);
        System.out.println("write year");
        int year = sc.nextInt();

        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }


    }
}
