public class lab035 {
    public static void main(String[] args) {
        String  name = "ankita";
        // String? // bunch of characters - collection of characters
        String name2 = new String("ankita");
        // how many ways we can create: 2
        //=, new operator
        // = 'SCP' string constant pool
        // new = objects (heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        //System.out.println(name.charAt(10)); exception case as no char is present at 10




    }
}
