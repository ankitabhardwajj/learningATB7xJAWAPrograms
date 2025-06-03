package ex_25032025;

import java.util.Scanner;

public class lab056 {
    public static void main(String[] args) {
        // take a user input as char and tell if it is a vowel

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a char");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("not a vowel");
                break;
        }

        }

    }

