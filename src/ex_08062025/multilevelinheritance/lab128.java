package ex_08062025.multilevelinheritance;

public class lab128 {
    public static void main(String[] args) {
        // grandfather -> father -> ankita
        ankita a1 = new ankita();
        a1.home(); // if name is same so ankita -> father -> grandfather
        // will use hwe own
        // if she does not have her own - have her father
        // if her father even do not have any
        // they use their grandfather's

        // WHAT IF NAMES ARE DIFFERENT
        //ANKITA CAN USE ALL THREE
        a1.c();
        a1.f();
        a1.gf();
        // if any relation got broken
        // ankita can not have theirs

    }
}
