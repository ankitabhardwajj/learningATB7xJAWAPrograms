package ex_08062025;

public class lab121 {

        int e = 42;// instance variable != global variable
    // java does not support global variable


         void f1(){
             int e = 10; // local variable
            System.out.println(e);
        }

        void f2(){
             // we can also change the value of e here
            // like e = 20;
            System.out.println(e);
        }

}
