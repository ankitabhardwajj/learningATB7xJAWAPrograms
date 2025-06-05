package ex_04062025;

public class lab081 {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){
            if (i==2){
                break;
            } else {
                System.out.println("continue");
            }
        }
        // if we write the if statement after printing first
        // then it type continue 3 times and them stop
        // means it include the 2 number  -  0,1,2
    }
}
