package ex_11062025.ex_interface.example3;

public class lab147 {
    public static void main(String[] args) {
        car c = new car();
        c.start();
    }

}

interface eng{
    void start();
}
interface gearbox extends eng{
    void gear();
}

class car implements gearbox{
    @Override
    public void start() {
        System.out.println("starting");
    }

    @Override
    public void gear() {
        System.out.println("gear");
    }
}
