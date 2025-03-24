public class lab032 {
    public static void main(String[] args) {


        // increment (++), decrement (--) operators
        // pre and post increment

        // pre increment
        // value is incremented first and then stored in the result
        int a = 10;
        int b = ++a;// a = a+1
        // exp = 11, a = 11
        System.out.println(a);
        System.out.println(b);

        int pre_a = 10;
        System.out.println(++pre_a);

        // post increment
        // value is stored first and incremented later
        int post_a = 10;
        System.out.println(post_a++);
        System.out.println(post_a);
    }
}
