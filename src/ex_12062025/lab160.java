package ex_12062025;

public class lab160 {
    public static void main(String[] args) {
        //EXCEPTIONS
        System.out.println("starting");

        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println(b);
        System.out.println("ending");// won't print cz of exception ->arithmetic

        // if we don't write any value -> arrayindexoutofboundexception
        // if we write ankita, as it can not be change into integer ->numberformatexception
        // of we write 0 -> arithmeticexception


    }
}
