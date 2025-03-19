package ex_13032025;

public class lab025 {
    public static void main(String[] args) {
        int a =  12;
        boolean b = !(a > 10 || a < 5); // || is OR gate
        System.out.println(b);
        // explanation
        // !(12 > 10 || 12 < 5)
        // !(true || false)
        // in OR gate only when both are false only then the result is false
        // so !( true )
        // false
    }
}
