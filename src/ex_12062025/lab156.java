package ex_12062025;

public class lab156 {
    public static void main(String[] args) {
        car c = new car("i10");
        c.drive();
        System.out.println(c.make);
        // we are not able to access m1 and m2 here so
        // to access inner class object(m1 and m2)
        car.gearbox cg = c.new gearbox();
        cg.m2();
        // for m1 again
        car.gearbox.nutbox nb = cg.new nutbox();
        nb.m1();




    }
}

class car{
    String  make;

    public car(String make){
        this.make = make;
    }


    void drive(){
        System.out.println("you can drive");
    }
    class gearbox{
        void m2(){
            System.out.println("m2");
        }

        class nutbox{
            void m1(){
                System.out.println("m1");
            }
        }
    }

}
