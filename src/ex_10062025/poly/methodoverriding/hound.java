package ex_10062025.poly.methodoverriding;

public class hound extends dog {
    int age= 10;
    @Override
    void bark (){
        System.out.println("i m a hound, i will bark");
    }

    void bike (){
        System.out.println("i have a bike");
    }
}
