package ex_04062025;

public class lab083 {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            System.out.println(i);
            if (i==5){
                continue;
            } else {
                System.out.println("after");
            } // print "after" after every number except 5
        }
    }
}
