package ex_04062025;

import java.util.Scanner;

public class lab093 {
    public static void main(String[] args) {
        // we can also do fizzbuzz by using scanner means for asking for input

        Scanner sc = new Scanner(System.in);
        System.out.println("the number is");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            if (i%3 ==0 && i%5 == 0){
                System.out.println("fizzbuzz");
            }
            else if (i%3 == 0){
                System.out.println("fizz");
            }
            else if (i%5 == 0){
                System.out.println("buzz");
            }
            else {
                System.out.println("none");
            }
        }


    }
}
