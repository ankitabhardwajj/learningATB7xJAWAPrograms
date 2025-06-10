package ex_10062025.superthiskeyword;

public class lab140 {
    //super.variable
    //super.method()
    // super() -> DC
    // super(int a) -> PC

    //this()
    //this.variablename
}
class person1{
    person1(){
        System.out.println("person1 - DC");
    }

    person1(String  a){
        System.out.println("person1 - PC A1");
    }

    person1(String  a, int b){
        System.out.println("person1 - PC A2");
    }
}
class student1 extends person1{
    student1 (String s){
        System.out.println("PC - Student");
    }

    student1(){
       // this("ankita");
        //super();
       //super("ankita");
        //super("ankita",2);
        // multiple super are not allowed
        // either call this or super

    }
}