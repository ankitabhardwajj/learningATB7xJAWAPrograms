package ex_10062025.encapsulation;

public class lab132 {
    public static void main(String[] args) {
        VWOlogin VWOlogin = new VWOlogin("ankita", 123);
        System.out.println(VWOlogin.password);
        VWOlogin.password = 124;
        System.out.println(VWOlogin.password);
    }

}
// we cn not have 2 public classes
// but can have any number of classes

class VWOlogin {
    public String username;
    public int password;



    public VWOlogin(String username,int password) {
        this.username = username;
        this.password = password;
    }
}
