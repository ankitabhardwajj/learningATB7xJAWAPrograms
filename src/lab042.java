public class lab042 {
    public static void main(String[] args) {
        String password = "ankita88";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        System.out.println(pass_u==password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        System.out.println(password.substring(0,4));
        System.out.println(password.indexOf(8));
        System.out.println(password.length());
    }
}
