public class lab029 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        //char c = a+b; not possible cz char and char results in int
        int c = a+b;

        System.out.println(c);// output is 131
        // cz ASCII value of A is 65 and B is 66
        // characters are integers

    }
}
