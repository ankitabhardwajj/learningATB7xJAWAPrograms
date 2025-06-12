package ex_12062025;

public class lab151 {
    public static void main(String[] args) {
        String num = "10";
        // int a = (int)num; -->> no
        Integer a = Integer.valueOf(num);
        System.out.println(a);

        // String to primitive
        int a2 = Integer.parseInt(num);
        System.out.println(a2);

        // String -> int , Integer
        // primitive to wrapper or reverse then u will use the concept


    }
}
