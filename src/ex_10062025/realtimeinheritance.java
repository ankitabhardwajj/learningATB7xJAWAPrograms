package ex_10062025;

public class realtimeinheritance {
    public static void main(String[] args) {
        baseclass t1 = new testcase1();
        t1.setBrowser("ankita", true);
        t1.openbroswer("ankita");
        t1.closebrowser();

    }
}

class testcase1 extends baseclass{
    @Override
     public void setBrowser(String browser, boolean isauth){
        super.setBrowser(browser, isauth);
    }
}
abstract class baseclass {
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isauth) {
        if (isauth) {
            this.browser = browser;
        } else {
            System.out.println("not allowed");
        }
    }

    void openbrowser(){
        System.out.println("chrome browser");
    }
    void openbroswer(String browsername){
        System.out.println("open browser"+ browsername);
    }
    void closebrowser(){
        System.out.println("close browser");
    }

}