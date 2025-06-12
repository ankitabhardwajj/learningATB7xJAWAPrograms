package ex_12062025;

public class lab153 {
    public static void main(String[] args) {
        A a = new A();
        a.age = 12;
        System.out.println(A.discount);
        a.m2();
        A.m1();
    }
}
 class A{
    int age = 10;// instance varibale
     static int discount = 199;// static variable

     // SIB - static initialisation bllock
    static{
        System.out.println("SIB- called once- one time load SIB");
    }
    // IIB - instance initialisation block
    {
         System.out.println("iib -  called whenever object is created ");
     }
     static void m1(){
         System.out.println("m1");
     }
     void m2(){
         System.out.println("m2");
     }

 }
