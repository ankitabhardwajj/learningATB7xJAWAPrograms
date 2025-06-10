package ex_10062025.encapsulation;

public class lab134 {
    public static void main(String[] args) {
        ICICIbank ankita = new ICICIbank("ankita", 1000);
        ankita.setBalance(2000, false);
        System.out.println(ankita.getBalance());
        System.out.println(ankita.getName());


        ICICIbank pramod = new ICICIbank("pramod", 20000);
        pramod.setBalance(20000,true);
        System.out.println(pramod.getBalance());
        System.out.println(pramod.getName());

    }

}
