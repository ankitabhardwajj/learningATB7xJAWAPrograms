package ex_12062025;

public class lab163 {
    public static void main(String[] args) {
        System.out.println("starting");
        int b = 0;
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            b = 1000/a;
        } catch ( ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }
        System.out.println(b);
        System.out.println("ending");

    }
}
