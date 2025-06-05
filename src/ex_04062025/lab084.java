package ex_04062025;

public class lab084 {
    public static void main(String[] args) {
        for (int i = 0; i<50; i++){
            if (i%2==0){
                System.out.println("even"+i);
                continue;
            } else {
                System.out.println("after"+i);
            }
        }
    }// if we use break here instead of continue
    // o is even so it just print even 0 and stops
}
