package ex_13062025;

public class lab173 {
    public static void main(String[] args) {
        try{
            String s1 = null;
            if (s1 == null) {
                throw new Exception("add a proper string");
            }
            s1.trim();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
