package ex_12062025;

public class lab162 {
    public static void main(String[] args) {
        int a=10/5;
        try {
            int b= 10/0;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("fool. divide by zero?");
        }
        System.out.println(a);
        System.out.println("end");

    }
}
