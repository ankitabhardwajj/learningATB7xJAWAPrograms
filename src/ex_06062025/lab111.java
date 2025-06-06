package ex_06062025;

public class lab111 {
    public static void main(String[] args) {
        // string - bunch of characters


        String s1 = new String("ankita");// heap area
        String s2 = "ankita";// string constant pool
        // strings are immutable means we can not change

        System.out.println(s1.length());
        System.out.println(s1.indexOf("k"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(4));

    }
}
