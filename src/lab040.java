public class lab040 {
    public static void main(String[] args) {
        String name = "the whale";//SCP
        String name1 = "the whale";// SCP

        // 1
        System.out.println(name == name1);// check for reference
        System.out.println(name.equals(name1));// check for content

        String name2 =  new String("the whale");
        System.out.println(name1 == name2);// check for reference
        System.out.println(name1.equals(name2)); // check for content

    }
}
