package ex_06062025;

public class lab104 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        // it shows exception with setting the values

        if (args.length>0){
            for (int i = 0; i < args.length; i++) {


                System.out.println(args[i]);
            }
        } else {
            System.out.println("no arguments");
        }
    }
}
