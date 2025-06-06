package ex_06062025;

import java.util.Scanner;

public class lab105 {
    public static void main(String[] args) {
        // 5 subject marks and their average program
        // functions are stored in stacks

        Scanner sc = new Scanner(System.in);
        float []marks = new float[5];
        System.out.println("enter marks  of sub1");
        marks[0] = sc.nextFloat();
        System.out.println("enter marks  of sub2");
        marks[1] = sc.nextFloat();
        System.out.println("enter marks  of sub3");
        marks[2] = sc.nextFloat();
        System.out.println("enter marks of sub4");
        marks[3] = sc.nextFloat();
        System.out.println("enter marks of sub5");
        marks[4] = sc.nextFloat();

        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4]/5);

        System.out.println("average is ->" +avg);


    }
}
