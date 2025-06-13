package ex_13062025;

public class lab174 extends Object{
    public static void main(String[] args)  {
        String s1 = "Ankita";
        String s2 = "ankita";
        if (s1.equalsIgnoreCase(s2)){// using ignore case it will ignore the capital or small
            // but if we use another alphabet then it won't ignore that one
            // if we want to make it case-sensitive then use only "equals"
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        //final -> constant
        // finally -> block of code with try and catch
        // finalize -> object function - threading use case
    }
}
