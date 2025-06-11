package ex_11062025.realLIFEexam;

public class lab144 {
    public static void main(String[] args) {
        chrome c = new chrome();
        c.openbrowser("chrome");
        c.closebrowser("chrome");


        firefox f= new firefox();
        f.openbrowser("fire");
        f.closebrowser("fire");
        f.takescreenshot();


    }
}
