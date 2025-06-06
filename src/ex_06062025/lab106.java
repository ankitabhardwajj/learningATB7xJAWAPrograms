package ex_06062025;

import java.util.Scanner;

public class lab106 {
    public static void main(String[] args) {
        // using for


        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter marks of sub" + (i + 1));
            marks[i] = sc.nextFloat();
        }

            for (int  i = 0; i < marks.length; i++) {
                System.out.println("marks of sub"+(i+1)+":"+marks[i]);


            }
            float avg = marks[0]+ marks[1]+marks[2]+marks[3]+marks[4]/5;
            System.out.println("avg is ->" +avg);

            int j = 0;
            while (j< marks.length){
                System.out.println(marks[j]);
                j++;

            }
            sc.close();

        }
    }

