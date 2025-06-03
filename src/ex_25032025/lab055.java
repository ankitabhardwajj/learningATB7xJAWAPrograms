package ex_25032025;

import java.util.Scanner;

public class lab055 {
    public static void main(String[] args) {
        // web automation
        // i will ask the user which browser u want me to run the code
        // chrome-> start chrome, firefox-> firefox, edge-> execution edge

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the browser name,where to execute program");
        String browsername = sc.next();
        browsername = browsername.toLowerCase();
        // now it can work in both upper and lower case

        switch (browsername) {
            case "chrome":
                System.out.println("starting the chrome browser");
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                break;
            case "edge":
                System.out.println("execute the edge code");
                break;
            default:
                System.out.println("no idea which browser is this");
                break;

        }


        }


    }
