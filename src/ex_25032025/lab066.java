package ex_25032025;

import java.util.Scanner;

public class lab066 {
    public static void main(String[] args) {
        // program to find  the largest number between 3 numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = sc.nextInt();
        System.out.println("enter number 1");
        int num2 = sc.nextInt();
        System.out.println("enter number 3");
        int num3 = sc.nextInt();

        // if(a>b) && (a>c) = a is greatest
        // if (b>a) && (b>c) = b is greatest
        // if (c>a) && (c>b) = c is greatest (also by default)



        if (num1>num2 && num1>num3){
            System.out.println("num1 is largest");
        }
        else if (num2>num1 && num2>num3){
            System.out.println("num2 is largest");
        }
        else{
            System.out.println("num3 is largest");
        }
        // if all are equal , it will print that digit


    }
}
