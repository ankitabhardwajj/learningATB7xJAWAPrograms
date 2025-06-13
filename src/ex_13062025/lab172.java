package ex_13062025;

import java.util.Scanner;

public class lab172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int x = sc.nextInt();
        if (x == 0){
            System.out.println("enter a non zero number");
        }else {
            System.out.println("perfect");
        }
        int a = 10/x;
        System.out.println(a);

    }
}
