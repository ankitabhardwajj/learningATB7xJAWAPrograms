package ex_14062025;

public class lab194 {
    public static void main(String[] args) {
        temp("ankita");
        temp(234);
        temp(true);

        sum(2,3);
        sum("ankita","bhardwaj");

        // t -> any data type
        // t can be capital or small

    }

    public static <t> t sum (t a, t b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
    public static <t> void temp(t name){// using this t everything is allowed cz
        // it automatically changes everything to string
        System.out.println(name);
    }
}
