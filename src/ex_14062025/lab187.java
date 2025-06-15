package ex_14062025;

public class lab187 {
    public static void main(String[] args) {
        person p1 = new person("ankita", "ab");
        person p2 =  new person("babita", "ba");
        System.out.println(p1);
        System.out.println(p2);
    }
}
class person extends Object{
    String name ;
    String address;


    public person(String name,String address) {
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return "NAME IS ->" + name + " , ADDRESS IS ->" +address;
    }
}
