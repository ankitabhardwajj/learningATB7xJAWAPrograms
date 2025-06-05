package ex_04062025;

public class lab091 {
    public static void main(String[] args) {
        // while and do while difference

        // while -> int -> condition -> body -> increment/decrement
        // do while -> int -> body -> increment/decrement -> condition
        // practical example

        int a = 10;
        while (a<10){
            System.out.println(a);
            a++;
        }// not output
        // but in do while

        int b = 10;
        do {
            System.out.println(a);
        } while (b<10);
        // it will print 10 cz the condition check at last
    }
}
