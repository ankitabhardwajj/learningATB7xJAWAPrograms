package ex_04062025;

import java.util.Scanner;

public class lab089 {
    public static void main(String[] args) {
        // coding program
        // factorial
        // of 5 is 5*4*3*2*1= 120
        // basically how to write is program
        // its is = factorial (the previous one like 4!)* i( the current value -like 5)

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int fact = 1;
        // starting fact is 1 always
        for (int i=1; i<=n; i++){
            fact= fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
    //just learn it
}
