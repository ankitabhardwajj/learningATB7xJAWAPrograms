package ex_13062025;

import java.util.Scanner;

public class lab171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        if  (name.equalsIgnoreCase("ankita")){
            try {
                throw new Exception("not allowed");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("allowed");
        }
    }

}
