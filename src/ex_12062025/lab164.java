package ex_12062025;

public class lab164 {
    public static void main(String[] args) {
        try{
            String s1 = "ankita";
            String a1 =args[0];
            int a = 10/0;
            s1 = null;
            System.out.println(s1.trim());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            // or
            System.out.println("there is some problem with the code");
        }
        System.out.println("end");
    }
}
