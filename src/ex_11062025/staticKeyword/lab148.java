package ex_11062025.staticKeyword;

public class lab148 {
    // static is a
    // block
    // also a data member
    // also a function
    // also a class

    public static void main(String[] args) {
        ATB a1 = new ATB("ankita");
        System.out.println(a1.getName());
        a1.setName("anki");
        System.out.println(a1.getName());
        System.out.println(ATB.coursename);

    }
}
class ATB{
    private String name;
    static String coursename  = "ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name ;
    }
}
