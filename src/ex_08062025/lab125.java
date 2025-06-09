package ex_08062025;

public class lab125 {
    public static void main(String[] args) {
        bankaccount ba1 = new bankaccount();
        System.out.println(ba1.balance);
        System.out.println(ba1.bankname);
        System.out.println(ba1.bankcode);

        bankaccount ba2 = new bankaccount();
        System.out.println(ba2.bankname);
        // print the same name

        // another one
        bankaccount ba3 = new bankaccount("ICICI", 200, "ICICI2");
        System.out.println(ba3.bankname);
        System.out.println(ba3.bankcode);
        System.out.println(ba3.balance);

        bankaccount ba4 = new bankaccount("axis", 300000);
        System.out.println(ba4.bankname);
        System.out.println(ba4.balance);


        ba3.prindetails();
        ba4.prindetails();
        }
    }
