package ex_08062025;

import java.util.Scanner;

public class lab126 {
    public static void main(String[] args) {
        bankaccount ba1 = new bankaccount();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the bank");
        String bankname = sc.next();
        System.out.println("enter balance");
        int balance = sc.nextInt();
        System.out.println("enter code");
        String bankcode = sc.next();

        bankaccount ba2 = new bankaccount(bankname,balance,bankcode);



        ba2.prindetails();
    }
}
