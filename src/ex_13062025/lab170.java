package ex_13062025;

public class lab170 {
    public static void main(String[] args) throws Exception{
        Bank sbi = new Bank("INR", 1000);
        Bank icici = new Bank("INR", 200);
        //Integer total = sbi.add(icici);
        //System.out.println(total);


        Bank baroda = new Bank("USD", 200);
        Integer total = sbi.add(baroda);
        System.out.println(total);

    }
}
