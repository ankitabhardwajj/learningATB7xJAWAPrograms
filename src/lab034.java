public class lab034 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        //A  = a++, a= 10
        // +
        // B = a, a = 11

        int b = 11;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A = a++, exp= 11, a= 12
        // +
        // B = ++a, exp= 13  , a= 13
    }
}
