package ex_10062025.superthiskeyword;

public class lab138 {
    // super()
    // 1. use of super with variables
    // 2. use of super with methods
    // 3. use of super with constructors

    // super keyword in java is a reference variable that allows
    // a subclass - child class
    // to refer to its parent class
    public static void main(String[] args) {
        car s = new car();
        s.display();
}

}


class car extends vehicle {
    private int maxspeed = 280;

    car (){
        super(10);
        System.out.println("DC car");
    }

    void display() {
        System.out.println("speed is" + this.maxspeed);
        System.out.println("vehicle is" +super.maxspeed);
        super.message();
        this.message();
    }
    @Override
    void message (){
        System.out.println("hello car");
    }
}

class vehicle {
    public int maxspeed = 180;

    vehicle(){
        System.out.println("DC vehicle");
    }
    vehicle( int a ){
        System.out.println("PC vehicle");
    }

    void message(){
        System.out.println("hello vehicle");
    }

    void message(int a){
        System.out.println("hello vehicle");
    }

}
