package ex_08062025;

public class bankaccount {
    String bankname;
    int balance;
    String bankcode;


    bankaccount(){
        bankname = "SBI";
        bankcode = "SBI200";
        balance = 200000;
    }


    bankaccount(String name,int balance, String code){
        this.bankname = name;
        this.balance = balance;
        this.bankcode = code;
    }

    bankaccount(String name, int balance){
        this.bankname = name;
        this.balance = balance;
    }




    void prindetails(){
        System.out.println("bank name ->"+bankname);
        System.out.println("bank code ->"+bankcode);
        System.out.println("bank balance ->"+balance);
    }

}
