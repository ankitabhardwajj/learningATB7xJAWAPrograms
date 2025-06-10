package ex_10062025.encapsulation;

public class lab133 {
    public static void main(String[] args) {
        VWOlogin1 VWOlogin = new VWOlogin1("ankita",123);
        System.out.println(VWOlogin.getUsername());
        VWOlogin.setUsername("anki");
        System.out.println(VWOlogin.getUsername());
        VWOlogin.setPassword(1234, true);

    }

}
// we cn not have 2 public classes
// but can have any number of classes

class VWOlogin1 {
    // data members
    private String username;
    private int password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password, boolean isauthor) {
        if (isauthor) {
            this.password = password;
        }else {
            System.out.println("not allowed");
        }
    }

    public VWOlogin1(String username, int password) {
        this.username = username;
        this.password = password;
    }
}
