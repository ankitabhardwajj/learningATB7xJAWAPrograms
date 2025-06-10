package ex_08062025.accessmodifiers.police;

public class cop2 {
    private int gun2;
    private String idcard2;


    private cop2(int gun){
        this.gun2 = gun;
    }

    private void canushoot(){
        System.out.println("yes,u can");
    }
}
