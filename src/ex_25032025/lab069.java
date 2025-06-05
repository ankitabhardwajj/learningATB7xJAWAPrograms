package ex_25032025;

import java.util.Scanner;

public class lab069 {
    public static void main(String[] args) {
        //program that prints numbers from 1 to 100
        // but its not just 1 to 100 in the program


        Scanner sc = new Scanner(System.in);
        System.out.println("write the number");
        int num = (sc.nextInt());

        if (num%3 ==0 && num%5 == 0) {
            System.out.println("fizzbuzz");
        }
         else if (num%3 == 0) {
            System.out.println("fizz");
        }
        else if (num%5 == 0) {
            System.out.println("buzz");
        }
        else {
            System.out.println("none");
        }
    }
}
