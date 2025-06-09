package ex_08062025;

public class lab117 {
    public static void main(String[] args) {
        bank bank1 = new bank();
        bank bank2 = new bank();

        bank1.name = "SBI";
        bank2.name = "ICICI";

        System.out.println(bank1.name);
        System.out.println(bank2.name);
        System.out.println(bank1.colour);

        bank2.colour = "blue";
        System.out.println(bank2.colour);
        System.out.println(bank1.colour);

    }
}
