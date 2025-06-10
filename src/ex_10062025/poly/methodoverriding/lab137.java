package ex_10062025.poly.methodoverriding;

public class lab137 {
    public static void main(String[] args) {
        hound h1 = new hound();
        h1.bark();
        h1.bike();
        // here we can use

        dog d1 = new dog();
        d1.bark();

        dog dog_ref = new hound();
        dog_ref.bark();
       // dog_ref.bike();
        // not possible as it should be common to both dog and hound

    }
}
