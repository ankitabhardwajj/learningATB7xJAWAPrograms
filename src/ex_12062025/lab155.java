package ex_12062025;

public class lab155 {
}
// nested class - rarely used

class OC{
    Integer a = 10;

    void OC_m1(){
        System.out.println("oc_m1");
    }

    class innerclass{
        Integer b = 20;
        void inner_m2(){
            System.out.println(a);
            System.out.println("IC_m2");
        }
    }
}


