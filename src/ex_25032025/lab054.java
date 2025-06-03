package ex_25032025;


import java.util.Scanner;

public class lab054 {
    public static void main(String[] args) {
        // switch - better way to use for 2+ conditions
        // which day is it? 1 to 7
        // 3 -> wednesday

        //MTWTFSS

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day from 1 to 7 nd tell what day it is");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("no idea what day it is");
                break;





        }
        System.out.println("outside the switch loop");
        // this outside of loop will always get printed
        // without break all the statements got executed with the one
    }
}
