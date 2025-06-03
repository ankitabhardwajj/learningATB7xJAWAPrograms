package ex_25032025;

public class lab062 {
    public static void main(String[] args) {
        // normally switch don't return anything
        // after jdk> 13
        // it can

        char code = 'B';
        int val = switch (code){
            case 'A':
                yield 22; // similar to return
            case 'B':
                yield 23;
            default:
                throw new IllegalStateException("unable" +code);
                // overall it just means
                // int val = 22
                // system.out.println(val);
                // we don't use this, rarely used
                // can not use return instead of yield
                // yield basically means return in future


        };
        System.out.println(val);


    }
}
