package ex_12062025;

public class lab165 {
    public static void main(String[] args) {
        final int age = 15;
        int a = 0;
        try {
            int b = 10/a;
        } catch (Exception e) {
            System.out.println("divide by 0");
        } finally {
            System.out.println("i will be executed anyhow!!");
        }

    }
}

