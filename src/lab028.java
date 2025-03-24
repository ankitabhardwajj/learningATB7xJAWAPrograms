public class lab028 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
       // byte c = a+b; //  not possible
        // why not?
        // cz when 1 operand is byte and second is byte so the result one should be int
        // therefore.. in that place it should be like this
        int d = a+b;
        System.out.println(d);


    }
}
