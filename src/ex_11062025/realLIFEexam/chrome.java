package ex_11062025.realLIFEexam;

public class chrome extends baseclass{
    @Override
    String openbrowser(String browser) {
        System.out.println("open the chrome");
        return "";
    }

    @Override
    String closebrowser(String browser) {
        System.out.println("close the chrome");
        return "";
    }

    @Override
    void takescreenshot() {
        System.out.println("take ss");
    }
}
