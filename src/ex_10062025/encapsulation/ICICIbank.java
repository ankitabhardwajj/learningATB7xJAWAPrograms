package ex_10062025.encapsulation;

public class ICICIbank {
    private String name;
    private long balance;


    public ICICIbank(String name, long balance) {
        this.name = name;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name,boolean isadmin) {
        if (isadmin) {
            this.name = name;
            System.out.println("allowed");
        }else {
            System.out.println("not allowed");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isadmin) {
        if (isadmin) {
            this.balance = balance;
            System.out.println("allowed");
        }else {
            System.out.println("not allowed");
        }
    }
}
