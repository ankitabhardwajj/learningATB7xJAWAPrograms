package ex_13062025;

public class lab166 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer[] i = new Integer[2];
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBound");
        } finally {
            // can add some file.close, scanner.close of present
            System.out.println("end of the program");
        }
    }
}
