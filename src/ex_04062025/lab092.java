package ex_04062025;

public class lab092 {
    public static void main(String[] args) {
        // fizzbuzz using for loop
        for (int i = 1; i<=100; i++){
            if (i%3 ==0 && i%5 == 0){
                System.out.println("fizzbuzz");
            }
            else if (i%3 == 0){
                System.out.println("fizz");
            }
            else if (i%5 == 0){
                System.out.println("buzz");
            }
            else {
                System.out.println("none");
            }
        }
    }
}
