package ex_08062025;

public class lab124 {
    public static void main(String[] args) {
        ATBperson p0 = new ATBperson();
        ATBperson p1 = new ATBperson("ankita");
        ATBperson p2 = new ATBperson("babita");
        ATBperson p3 = new ATBperson("pummy",987654321);
        System.out.println(p0.name);
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.number);
        System.out.println(p3.name);
    }
}
