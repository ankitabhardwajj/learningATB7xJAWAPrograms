package ex_25032025;

import java.util.Scanner;

public class lab052 {
    public static void main(String[] args) {
        // grade calculator
        // write a program that calculates and displays
        // the letter grade for a given numerical
        // score (e.g. a,b,c,d,or f)
        // based on the following grading scale
        // a = 90-100
        // b = 80-89
        // c = 70-79
        // d = 60-69
        // f = 0-59

        // 1. find the user inputs
        // score -> data type -> int
        // return -> grade -> char
        // scanner class we use to take the input

        // 2. basic logic
        // if (score >= 90 and <=100)-> a
        // else if (score >= 80 and <=89)-> b
        // else if (score >= 70 and <=79)-> c
        // else if (score >= 60 and <=69)-> d
        // else (score >= 0 and <=59)-> f

        // 3. write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student score");
        int score = sc.nextInt();

        char grade = 'b';

        if (score >= 90 && score<= 100) {
            grade = 'a';
        } else if (score >= 80 && score<=89) {
            grade = 'b';
        } else if (score >= 70 && score <=79) {
            grade = 'c';
        } else if (score >= 60 && score <= 69) {
            grade = 'd';
        } else if (score <= 0 || score >100) {
            System.out.println("LOL, are u a god"); // do this situation only if asked
        } else {
            grade = 'f';
        }
        System.out.println("your grade is -> " +grade);

        sc.close();

    }


    }

