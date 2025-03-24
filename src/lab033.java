public class lab033 {
    public static void main(String[] args) {
        int a = 15;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        // exp= (before increment ) its value is the same so, 15
        // a = (after increment) so, 15+1 = 16


        // same for the pre
        int b= 15;
        int r = ++b;
        System.out.println(b);
        System.out.println(r);

        // exp = 15+1 = 16
        // b = 16

    }
}
