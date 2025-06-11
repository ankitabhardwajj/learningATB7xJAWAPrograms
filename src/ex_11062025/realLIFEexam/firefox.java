package ex_11062025.realLIFEexam;

public class firefox extends baseclass {
    @Override
    String openbrowser(String browser) {
        System.out.println("open the firefox");
        return "";
    }

    @Override
    String closebrowser(String browser) {
        System.out.println("close the firefox");
        return "";
    }

    @Override
    void takescreenshot() {
        System.out.println("taking ss");
    }
}
