package ex_25032025;

import java.util.Scanner;

public class lab068 {
    public static void main(String[] args) {
        // write a program that classifies a triangle based on its side length

        Scanner sc = new Scanner(System.in);
        System.out.println("first side");
        int side1 = sc.nextInt();
        System.out.println("second side");
        int side2 = sc.nextInt();
        System.out.println("third side");
        int side3 = sc.nextInt();


        if (side1 == side2 && side2 == side3){
            System.out.println("equilateral");
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("isosceles");
        }
        else{
            System.out.println("scalene");
        }
    }
}
