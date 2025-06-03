package ex_25032025;

public class lab060 {
    public static void main(String[] args) {
        // jdk> 13
        // if we fed up using break again nd again what we can do is...

        int itemcode = 12;
        switch (itemcode){
            case 1,2,3 -> System.out.println("electrical");
            case 4,5 -> System.out.println("mechanical");
            default -> System.out.println("none");
            // we use arrow instead of break

        }
    }
}
