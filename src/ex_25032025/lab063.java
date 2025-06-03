package ex_25032025;

import java.util.Scanner;

public class lab063 {
    public static void main(String[] args) {
        // write program name, age, salary - print it

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.next();

        System.out.println("enter age");
        int age = sc.nextInt();

        System.out.println("enter salary");
        double salary = sc.nextDouble();

        System.out.println("your details ="+ name);
        System.out.println("your age=" + age);
        System.out.println("your salary=" + salary);

        sc.close();
    }
}
